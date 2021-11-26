package basic;

import java.util.Scanner;
/**
 * HelloScan
 */
public class HelloScan {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = reader.nextLine();

        System.out.println("Hello " + name +".");
        reader.close();
    }
}