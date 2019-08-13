package com.company;

import java.util.Scanner;

public class NormalCalculator {

    public double Validate(){
        Scanner sc = new Scanner(System.in);
        double a;

        while (true){
            try{
                System.out.println("Enter number: ");
                a = Double.parseDouble(sc.next());
                break;
            }
            catch (NumberFormatException ex){
                System.out.println("Invlaid input !!!");
            }
        }
        return a;
    }

    public String operatorValidate(){
        Scanner sc = new Scanner(System.in);
        String operator;

        while(true){
            System.out.println("Enter operator: ");
            operator = sc.nextLine();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^") || operator.equals("=")){
                break;
            }
            else {
                System.out.println("input must be (+, -, *, /, ^, =)");
            }
        }
        return operator;
    }

    public void normalCalculator(){
        double memory;
        memory = Validate();

        while(true) {
            String operator = operatorValidate();

            if (operator.equals("=")) {
                System.out.println("Result: " + memory);
                break;
            }

            double b;
            b = Validate();

            if (operator.equals("+")){
                memory += b;
            }

            if (operator.equals("-")){
                memory -= b;
            }

            if (operator.equals("*")){
                memory *= b;
            }

            if (operator.equals("/")){
                    if (b == 0){
                        System.out.println("Can't solve ");
                    }
                    else {
                        memory /= b;
                    }
            }

            if (operator.equals("^")){
                memory = Math.pow(memory,b);
            }
            System.out.println("Memory: " + memory);
        }
    }
}
