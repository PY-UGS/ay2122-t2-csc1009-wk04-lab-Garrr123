package Week4;

import Week4.BMI;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches ");
        int height = input.nextInt();

        BMI finalBMI = new BMI(height, weight);
        System.out.println("BMI is " + finalBMI.getBMI());
        finalBMI.healthStatus();



    }
}
