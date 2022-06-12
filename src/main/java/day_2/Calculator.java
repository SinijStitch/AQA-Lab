package day_2;

public class Calculator {
    public static void main(String[] args) {
        double a = 2.66;
        double b = 10;

        System.out.println(add(a,b));
        System.out.println(minus(a,b));
        System.out.println(mult(a,b));
        System.out.println(divide(a,b));
    }

    public static double divide(double a, double b) {

        if (b==0) {
            System.out.println("you can't divide by zero deafult answer 0 is wrong:");
            return 0;
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
