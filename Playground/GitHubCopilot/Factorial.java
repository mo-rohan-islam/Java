// package Playground.GitHubCopilot;

package GitHubCopilot;

public class Factorial {
    
    public void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
