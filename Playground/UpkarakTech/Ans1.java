package Playground.UpkarakTech;

import java.lang.Math;
import java.util.Scanner;

public class Ans1 {

    public double FindX (double A, double B) {

        return Math.sqrt(3*A + 1)/B;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        try {

            System.out.print("Enter value of A: ");
            double A = scan.nextDouble();

            System.out.print("Enter value of B: ");
            double B = scan.nextDouble();

            System.out.println("The result of [{(3A+1)^(1/2)} / B] over " + A + " and " + B + " is " + new Ans1().FindX(A,B));
       
        } catch (Exception e) {
            System.out.println("Encountered " + e);
        }
        
        scan.close();
    }
}