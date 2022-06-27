package day_2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws Exception {
        double a = 2.66;
        double b = 10;
        System.out.println("choose an action where");
        System.out.println("1:+");
        System.out.println("2:-");
        System.out.println("3:*");
        System.out.println("4:/");
        Scanner scanInput = new Scanner(System.in);
        int inputNumber = scanInput.nextInt();
        if (inputNumber == 1) {
            System.out.println(add(a,b));
        } else if (inputNumber == 2) {
            System.out.println(minus(a,b));
        } else if (inputNumber == 3) {
            System.out.println(mult(a,b));
        } else if (inputNumber == 4) {
            System.out.println(divide(a,b));
        }
        else {
            System.out.println("unknown action");
        }
    }
    public static double divide(double a, double b) throws Exception {

        if (b==0) {
            throw new Exception("dybil na 0 ne dilyat");
        }
        else return a / b;
    }

    public static double mult(double a, double b) {
        return a*b;
    }

    public static double minus(double a, double b) {
        return a-b;
    }

    public static double add(double a, double b) {
        return a+b;
    }
}
