import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {

        Map<String, Integer> wordCounts = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\D-drive\\Shared\\input.txt")))) {

            String line = "";
            while ((line = reader.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
