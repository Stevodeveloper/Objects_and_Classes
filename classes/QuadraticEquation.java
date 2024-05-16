package classes;

import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquation {

    private static int a;
    private static int b;
    private static int c;

    public QuadraticEquation() {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public int getDicriminant() {
        return (int) (Math.pow(b, 2) - (4 * a * c));
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getRoot1() {
        if (getDicriminant() < 0) {
            return 0;
        } else {
            double r1 = (((b * -1) + Math.sqrt(getDicriminant())) / (2 * a));
            return r1;
        }
    }

    public double getRoot2() {
        if (getDicriminant() < 0) {
            return 0;
        } else {
            double r2 = (((b * -1) - Math.sqrt(getDicriminant())) / (2 * a));
            return r2;
        }

    }

    public void diplayRoot() {
        if (getDicriminant() > 0) {
            System.out.println("The root are: " + getRoot1() + " " + getRoot2());

        } else if (getDicriminant() == 0) {
            System.out.println("The root is: " + getRoot1());
        } else
            System.out.println("The equation has no roots.");

    }

    public static void main(String[] args) {
        QuadraticEquation quad = new QuadraticEquation();
        // System.out.println("Hello there");
        // quad.getDicriminant();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values of a , b and c : ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        quad.diplayRoot();
    }
}