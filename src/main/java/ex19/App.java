/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package ex19;

import java.util.Scanner;

public class App {
    static double checkingNumber(Scanner in, String prompt) {
        System.out.print(prompt);
        String input;
        while(!in.hasNextDouble())
        {
            System.out.println("Input must be numeric.");
            System.out.print(prompt);
            input = in.nextLine();
        }
        input = in.nextLine();
        double value = Double.parseDouble(input);
        return value;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double weight = checkingNumber(in, "Please enter your weight in pounds. ");
        double height = checkingNumber(in, "Please enter your height in inches. ");

        double bmi = ((weight) / (height * height)) * 703;
        System.out.printf("Your BMI is %.2f.\n", bmi);

        if(bmi <= 25 && bmi >= 18.5){
            System.out.println("You are within the ideal weight range.");
        }else if(bmi < 18.5){
            System.out.println("You are underweight. You should see a doctor.");
        }else if (bmi > 25)
            System.out.println("You are overweight. You should see a doctor.");
    }
}
