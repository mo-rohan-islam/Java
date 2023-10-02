// package Playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiVowelCount {

    public static void main(String[] args) {

        String input = "ANother input with special characters : ! @ # $ % ^ & * ( ) ";
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        // input = input.toLowerCase();
        int countVowels = 0;

        countVowels = (int) input.chars()
                .map(Character::toLowerCase)
                .filter(currentChar -> vowels.contains((char) currentChar))
                .count();

        System.out.println("Input String: " + input);
        System.out.println("Number of vowels in the input string is : " + countVowels);
    }

}
