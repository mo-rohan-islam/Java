public class ExtractingNumbers {

    public static void main(String[] args) {
        System.out.println(ExtractingNumbers.solve("ab12cd34e")); // Expected Output: 46 | Explanation: 12 + 36
    }

    public static Long solve(String A) {

        Long sum = 0L;
        StringBuilder number = new StringBuilder();

        for (char c : A.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            } else if (number.length() > 0) {
                sum += Long.parseLong(number.toString());
                number.setLength(0);
            }
        }

        if (number.length() > 0) {
            sum += Long.parseLong(number.toString());
        }

        return sum;
    }

}
