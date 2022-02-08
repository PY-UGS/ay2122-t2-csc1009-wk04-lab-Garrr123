package Week4;

import java.lang.Math.*;

public class BMI {
    private double height;
    private double weight;
    double finalBMI;

    public BMI(){
        height = 0;
        weight = 0;
        finalBMI = 0;
    }

    public BMI(double height , double weight){
        this.height = height;
        this.weight = weight;
    }

    public double getBMI(){
        double CMConvertor = 2.54;
        double BMIconverter = 0.45359237;
        finalBMI = (weight * BMIconverter) / Math.pow(((CMConvertor * height)/100),2);

        return finalBMI;
    }

    public double healthStatus(){
        String status;
        if (finalBMI <18.5){
            System.out.println("Underweight");
        }else if(finalBMI >= 18.5 & finalBMI < 25.0){
            System.out.println("Normal");
        }else if(finalBMI >= 25.0 & finalBMI < 30.0){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }

        return 1;
    }
}
