// package Playground;

// Write a program to read two sets of numbers from user using arrays. Each SET contains 10 numbers without duplicates. The program must print the numbers that are available in only one of the sets not on both.
// For example 
// SET A = { 2,4,7,8}
// SET B = { 3,4,7,9}
// Then program will print 2,3,8,9

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqNums {
    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // Hashtable<Integer, Integer> ht1 = new Hashtable<>();
    // Hashtable<Integer, Integer> ht2 = new Hashtable<>();

    // System.out.print("\nEnter MAX Items: ");
    // int MAX_ITEMS = scan.nextInt();

    // int setA[] = new int[MAX_ITEMS];
    // int setB[] = new int[MAX_ITEMS];
    // int setC[] = new int[2 * MAX_ITEMS];

    // System.out.println("Enter " + MAX_ITEMS + " numbers each for 2 arrays\n");
    // for (int i = 0; i < MAX_ITEMS; i++) {

    // System.out.print("Enter item " + (i + 1) + " for array 1: ");
    // setA[i] = scan.nextInt();
    // ht1.put(i, setA[i]);
    // // }
    // // System.out.println();
    // // for (int i = 0; i < MAX_ITEMS; i++) {
    // System.out.print("Enter item " + (i + 1) + " for array 2: ");
    // setB[i] = scan.nextInt();
    // ht2.put(i, setB[i]);
    // }
    // scan.close();

    // int index_setC = 0;
    // for (int i = 0; i < MAX_ITEMS; i++) {

    // if (!ht2.containsValue(setA[i])) {
    // setC[index_setC] = setA[i];
    // index_setC++;
    // }

    // if (!ht1.containsValue(setB[i])) {
    // setC[index_setC] = setB[i];
    // index_setC++;
    // }
    // }

    // System.out.print("\nUnique Numbers comparing both arrays: ");
    // for (int i = 0; i < index_setC; i++) {

    // if (i != index_setC - 1) {
    // System.out.print(setC[i] + ",");
    // } else {
    // System.out.println(setC[i]);
    // }
    // }

    // List<String> uniqueList = Arrays.stream(setC)
    // .filter(n -> n != 0)
    // .mapToObj(n -> Integer.toString(n))
    // .collect(Collectors.toList());
    // System.out.println(uniqueList);
    // }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> uniqueSet = new HashSet<>();

        System.out.print("Enter MAX_SIZE: ");
        int MAX_SIZE = scan.nextInt();

        System.out.print("Enter elements of list1: ");
        for (int i = 0; i < MAX_SIZE; i++) {
            int input = scan.nextInt();
            list1.add(input);
        }

        System.out.print("Enter elements of list2: ");
        for (int i = 0; i < MAX_SIZE; i++) {
            int input = scan.nextInt();
            list2.add(input);
        }
        scan.close();

        uniqueSet.addAll(list1);
        uniqueSet.addAll(list2);

        System.out.println("Unique List: " + uniqueSet);

    }
}
