package org.example;
import org.example.Service.KitchenService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KitchenService kitchen_service = new KitchenService();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What do you want to do?");
            System.out.println("Available actions: add ingredient | find an ingredient");
            String new_action = sc.nextLine();
            if (new_action.equals("add ingredient")){
                System.out.println("how many times do you want to do this?");
                String new_action_quantity_str = sc.nextLine();
                int new_action_quantity = Integer.parseInt(new_action_quantity_str);
                String new_result = kitchen_service.organizePantry(new_action, new_action_quantity);
                System.out.println(new_result);
            }
            else {
                String new_result = kitchen_service.organizePantry(new_action, 0);
                System.out.println(new_result);
            }



        }
    }
}