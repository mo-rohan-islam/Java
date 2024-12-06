package UpkarakTech;

import java.lang.Math;
import java.util.Scanner;

public class Ans1 {

    public double FindX(double A, double B) {

        return Math.sqrt(3 * A + 1) / B;
    }

    public static void main(String[] args) {

        double A = 0;
        double B = 0;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter value of A: ");
            A = scan.nextDouble();

            System.out.print("Enter value of B: ");
            B = scan.nextDouble();
        } catch (NumberFormatException e) {
            System.out.println("Encountered " + e.getLocalizedMessage());
        }

        Ans1 object = new Ans1();
        double X = object.FindX(A, B);

        System.out.println("The result of [{(3A+1)^(1/2)} / B] over "
                + A + " and " + B + " is " + X);
    }
}