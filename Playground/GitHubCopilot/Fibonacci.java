package Playground.GitHubCopilot;

public class Fibonacci {
    
    public void fibonacci(int n) {
        int fib = 0;
        int fib1 = 1;
        int fib2 = 0;
        for (int i = 1; i <= n; i++) {
            fib = fib1 + fib2;
            fib2 = fib1;
            fib1 = fib;
        }
        System.out.println(fib);
    }
}
