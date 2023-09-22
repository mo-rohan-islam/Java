import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
interface EvenOrOdd {
    void apply(int a, int b);
}

public class FunctionalInterfaceEvenOdd {
    public static void main(String[] args) {
        EvenOrOdd checkEvenOrOdd = (a, b) -> {
            // Predicate<Integer> check = num -> num % 2 == 0 ? true : false;

            Consumer<Integer> result = num -> {
                if (num % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            };

            result.accept(a);
            result.accept(b);

            Function<Integer, String> resultFunction = num -> (num % 2 == 0) ? "Even" : "Odd";
            System.out.println(resultFunction.apply(a));
            System.out.println(resultFunction.apply(b));

        };

        checkEvenOrOdd.apply(5, 6);
    }

}
