import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * PlusMinus
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.println(pos / (double) n);
        System.out.println(neg / (double) n);
        System.out.println(zero / (double) n);

        DecimalFormat f = new DecimalFormat("0.000000");
        System.out.println(f.format(pos/(double)n));

        System.out.println(String.format("%.6f", (neg/(double)n)));

        sc.close();
    }
}