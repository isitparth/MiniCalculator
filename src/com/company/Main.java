package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       float number_1,number_2;
        System.out.println("Enter first Number");
        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();
        System.out.println("Enter second Number");

        Scanner scan2 = new Scanner(System.in);
        number_2 = scan2.nextFloat();
        System.out.print("You have entered");
        System.out.print(number_1);
        System.out.print("And");
        System.out.println(number_2);
        String prompt = "Enter 0 for addition, 1 for " +
                "subtraction, 2 for multiplication and 3 for division";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding these numbers");
                System.out.print("The result is:");
                System.out.println(number_1 + number_2);
                break;
            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print("The result is:");
                System.out.println(number_1 - number_2);
                break;
            case 2:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is:");
                System.out.println(number_1 * number_2);
                break;
            case 3:
                System.out.println("Dividing these numbers");
                System.out.print("The result is:");
                System.out.println(number_1 / number_2);
                break;
            default:
                System.out.println("Invalid number");
        }

    }
}
