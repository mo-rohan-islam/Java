import java.util.concurrent.*;

public class DashboardAggregator {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Hint: Use Thread.sleep() to simulate latency. Return a String result.
        Callable<String> userInfoTask = () -> {
            // Simulate 200ms delay
            Thread.sleep(200);
            return "User: Rohan Islam";
        };

        Callable<String> ordersTask = () -> {
            // Simulate 1000ms delay
            Thread.sleep(1000);
            return "Orders: [Laptop, Mouse, Keyboard]";
        };

        Callable<String> loyaltyTask = () -> {
            // Simulate 600ms delay
            Thread.sleep(600);
            return "Points: 5000";
        };

        try {
            Future<String> userFuture = executor.submit(userInfoTask);
            Future<String> ordersFuture = executor.submit(ordersTask);
            Future<String> loyaltyFuture = executor.submit(loyaltyTask);

            String userData = userFuture.get();
            String ordersData = ordersFuture.get();
            String loyaltyData = loyaltyFuture.get();

            System.out.println("--- User Dashboard ---");
            System.out.println(userData);
            System.out.println(ordersData);
            System.out.println(loyaltyData);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal Time Taken: " + (endTime - startTime) + "ms");
    }
}