package classes;

import java.util.Scanner;

public class LinearEquation {
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;

    // @SuppressWarnings("static-access")
    public LinearEquation() {

    }

    // getters
    public int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static int getC() {
        return c;
    }

    public static int getD() {
        return d;
    }

    public static int getE() {
        return e;
    }

    public static int getF() {
        return f;
    }

    public boolean isSolvable() {
        if (((a * d) - (b * c) != 0)) {

            return true;
        } else
            return false;
    }

    public double getX() {
        if (isSolvable() == true) {
            int sol = (((e * d) - (b * f)) / ((a * d) - (b * c)));
            return sol;

        } else
            System.out.println("The equation ha no solution");
        return 0;
    }

    public double getY() {
        if (isSolvable() == true) {
            int sol = (((a * f) - (e * c)) / ((a * d) - (b * c)));
            return sol;

        } else
            System.out.println("The equation ha no solution");
        return 0;
    }

    public static void main(String[] args) {

        LinearEquation lin = new LinearEquation();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the values for a, b, c, d, e and f: ");
        a = userInput.nextInt();
        b = userInput.nextInt();
        c = userInput.nextInt();
        d = userInput.nextInt();
        e = userInput.nextInt();
        f = userInput.nextInt();
        lin.getX();
        lin.getY();
    }

}
