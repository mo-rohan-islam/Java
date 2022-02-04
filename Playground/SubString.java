package Playground;

import java.util.Scanner;

/**
 * SubString
 * 
 * Input: wim$#&gra7m
 * 
 */
public class SubString {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String str = scan.nextLine();

        String output = "";

        for (int i = 0; i < str.length(); i++) {
            
            char ch = str.charAt(i);
            if ((ch >= 65 && ch <=90) || (ch >=97 && ch <=122)) {
                continue;
            } else {
                output = output + ch;
            }
        }

        System.out.println("Output: " + output);
        scan.close();
    }
}