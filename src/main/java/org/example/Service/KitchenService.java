package org.example.Service;

import org.example.Model.Ingredient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class KitchenService {
    List<Ingredient> pantry;

    public KitchenService() {
        this.pantry = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient_entry) {
        pantry.add(ingredient_entry);
    }

    public String organizePantry(String action, int action_quantity) {
        if (action.equals("add ingredient")) {

            for (int i = 0; i < action_quantity; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("input ingredient name");
                String ingredient_name_entry = sc.nextLine();
                System.out.println("input ingredient amount");
                String ingredient_amount_entry_str = sc.nextLine();

                double ingredient_amount_entry = Double.parseDouble(ingredient_amount_entry_str);

                Ingredient ingredient_entry = new Ingredient(ingredient_name_entry, ingredient_amount_entry);

                addIngredient(ingredient_entry);

            }
            return "Ingredients added";
        } else if (action.equals("find an ingredient")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("input ingredient name");
            String ingredient_name_entry = sc.nextLine();
            return "Found: " + getIngredientbyName(ingredient_name_entry);
        }

        else {
            System.out.println("No valid action entered");
        }

        return "No valid action entered";
    }
    public String getIngredientbyName(String ingredient_name) {
        // will add feature to specify unit of measurement and convert as needed.

        double amount = 0.0;
        for (int i = 0; i < pantry.size(); i++){
            Ingredient ingredient = pantry.get(i);
            if (ingredient.getName().equals(ingredient_name)) {
                amount+=ingredient.getAmount();
            }
        }

        if (amount==0){return "Nothing";}
        if (amount % 1 ==0) {
            int amount_int = (int) amount;
            return amount_int + " " + ingredient_name;
        }
        return amount + " " + ingredient_name;
    }


}

