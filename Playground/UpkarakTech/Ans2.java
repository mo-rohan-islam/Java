package UpkarakTech;

import java.util.Scanner;

public class Ans2 {

    public int largest(int[] intArray) {
        int largest_item = 0;
        for (int item : intArray) {
            if (item > largest_item) {
                largest_item = item;
            }
        }
        return largest_item;
    }

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int SIZE = scan.nextInt();

            int num_array[] = new int[SIZE];
            System.out.println("Enter " + SIZE + " numbers to find the largest among them\n");
            for (int i = 0; i < SIZE; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                num_array[i] = scan.nextInt();
            }

            Ans2 object = new Ans2();
            int max = object.largest(num_array);
            System.out.println("\nThe largest element is " + max);
        } catch (NumberFormatException e) {
            System.out.println(e.getLocalizedMessage() + "! Expected Integer value");
            e.printStackTrace();
        }
    }
}
