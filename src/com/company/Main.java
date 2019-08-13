package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            while (true) {
                try {
                    System.out.println("Choose option: ");
                    choice = Integer.parseInt(sc.next());

                    if (choice < 1 || choice > 4) {
                        System.out.println("Option must between 1-4 !!!");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input !!!");
                }
            }

            if (choice == 1) {
                System.out.println("------ Normal Calculator ------");
                NormalCalculator n = new NormalCalculator();
                n.normalCalculator();
            }

            if (choice == 2) {
                System.out.println("------ BMI Calculator ------");
                BMI b = new BMI();

                int h, w;

                System.out.println("Enter weight: ");
                w = b.Validate();
                System.out.println("Enter height: ");
                h = b.Validate();

                b.BMICalculator(h, w);
            }

            if (choice == 3) {
                System.exit(0);
            }
        }

    }
}
