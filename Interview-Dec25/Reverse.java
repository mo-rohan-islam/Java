class Reverse {

    public static void main(String[] args) {
        String input = "My name is Rohan Islam.";
        System.out.println("Input: " + input);
        System.out.println("Output: " + reverse(input));
    }

    public static String reverse(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }
}