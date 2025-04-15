package org.example;

import java.util.Scanner;

public class Shop {
    static Scanner asking = new Scanner(System.in);
    static double basePrice;
    static double finalPrice;
    static double discount;
    public static void SandwichSize() {
        System.out.println("What size sandwich?");
        System.out.println("1:Regular: base price $5.45 ");
        System.out.println("2:Large: base price $8.95 ");

        int choice = asking.nextInt();


        if (choice ==1) {
            basePrice = 5.45;
            System.out.println("You chose Regular: base price $5.45 ");
        } else if (choice ==2) {
            basePrice = 8.95;
            System.out.println("You chose Large: base price $8.95 ");
        } else {
            System.out.println("Invalid selection");
            return;
        }

    }
    public static void Age() {
        System.out.println("How old are you?");
        int age = asking.nextInt();

         discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
            System.out.println("Receive 10% student discount");
        } else if (age >= 65) {
            discount = 0.20;
            System.out.println("recieve 20% senior discount");
        }
        finalPrice = basePrice * (1 - discount);
        System.out.printf("The total for the Sandwich is: $%.2f%n", finalPrice);

    }
}
