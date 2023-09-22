import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountWithStreams {
    public static void main(String[] args) {

        Map<String, Long> wordCounts = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\D-drive\\Shared\\input.txt")))) {

            wordCounts = reader.lines()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase())
                    .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        wordCounts.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
