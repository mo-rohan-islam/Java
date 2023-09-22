public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(" ~a = " + ~a);

        int n = 5; // 101
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }

        System.out.println(count);

    }
}
