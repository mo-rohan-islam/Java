package GitHubCopilot;

public class Fibonacci {

    public void fibonacci(int n) {
        int fib = 0;
        int fib1 = 0;
        int fib2 = 1;

        System.out.print(fib1 + ", " + fib2);

        for (int i = 0; i < n - 2; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
            System.out.print(", " + fib);
        }
        System.out.println("\n" + fib);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(5);
    }
}
