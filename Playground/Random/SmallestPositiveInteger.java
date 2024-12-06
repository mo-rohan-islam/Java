/*

Write a function: class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 1.
Given A = [1, 2, 3], the function should return 1.
Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

*/

import java.util.Arrays;

public class SmallestPositiveInteger {
    public static void main(String[] args) {
        int[] A1 = { 1, 3, 6, 4, 1, 2 };
        int[] A2 = { 5, 2, 3 };
        int[] A3 = { -1, -3, 1 };
        int[] A4 = { -7, -5 };

        int[][] arraysOfInput = { A1, A2, A3, A4 };

        for (int[] A : arraysOfInput) {
            int smallestPositiveInteger = smallestPositiveInteger(A);
            System.out.println(String.format("The Smallest Positive Integer in %s is %d",
                    Arrays.toString(A), smallestPositiveInteger));
        }
    }

    private static int smallestPositiveInteger(int[] A) {

        // return Arrays.stream(A)
        // .filter(n -> n > 0)
        // .min().getAsInt();

        int smallestInteger = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                if (A[i] < smallestInteger) {
                    smallestInteger = A[i];
                }
            } else {
                smallestInteger = 1;
            }
        }

        // if (smallestInteger < 1) {
        // throw new NoSuchElementException("Smallest Integer: " + smallestInteger);
        // // throw new InvalidParameterException("Input contains no positive integers!
        // " +
        // // Arrays.toString(A));
        // }

        return smallestInteger;
    }
}
