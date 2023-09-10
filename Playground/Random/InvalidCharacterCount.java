import java.util.function.Predicate;

public class InvalidCharacterCount {
    public static void main(String[] args) {
        String text = "aa abc@ sad$ hsagd^";
        Predicate<Integer> checkValid = ch -> ch >= 97 && ch <= 122 || ch >= 48 && ch <= 57 || ch == 32;
        long count = text.chars().filter(ch -> !checkValid.test(ch)).count();
        int answer = Math.toIntExact(count);
        System.out.println(answer);
    }
}
