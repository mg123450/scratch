package org.example.Model;


public class Ingredient {
    private String ingredient_name;
    private String measure_unit;
    private double amount;

    public Ingredient(String ingredient_name, String measure_unit, double amount){
        this.ingredient_name = ingredient_name;
        this.measure_unit = measure_unit;
        this.amount = amount;
    }

    public Ingredient(String ingredient_name, double amount){
        this.ingredient_name = ingredient_name;
        this.measure_unit = "units";
        this.amount = amount;
    }

    public String getName(){
        return ingredient_name;
    }
    public double getAmount(){
        return amount;
    }
    public String getUnit(){
        return measure_unit;
    }

    // Override toString for better representation
    @Override
    public String toString() {
        return "Ingredient{ \n" +
                "ingredient_name='" + ingredient_name + '\n' +
                ", measure_unit='" + measure_unit + '\n' +
                ", amount='" + amount + '\n' +
                '}';
    }

}