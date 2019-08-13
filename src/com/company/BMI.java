package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BMI {
    public int Validate(){
        Scanner sc = new Scanner(System.in);
        int a;
        while(true){
            try{
                a = Integer.parseInt(sc.next());

                if (a<0){
                    System.out.println("Input must > 0 !!!");
                }
                else {
                    break;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input !!!");
            }
        }
        return a;
    }

    public void BMICalculator(int height, int weight){
        double mHeight = (double) height/100;
        double bmi = (double) weight / (mHeight * mHeight);

        System.out.println("BMI number: " + bmi);

        String status = " ";
        if (bmi < 19){
            status += "Under - Standard";
        }
        if (bmi>= 19 && bmi < 25){
            status += "Standard";
        }
        if (bmi >= 25 && bmi<30){
            status += "Over - weight";
        }
        if (bmi >= 30 && bmi < 40){
            status += "Fat";
        }
        if (bmi > 40){
            status += "Very Fat";
        }

        System.out.println("Your status: " + status);
    }

}
