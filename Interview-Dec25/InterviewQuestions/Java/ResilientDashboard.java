import java.util.concurrent.*;
import java.util.*;

public class ResilientDashboard {

    // --- MOCK SERVICES (Do not change these) ---
    static Callable<String> userProfileService = () -> {
        TimeUnit.MILLISECONDS.sleep(200); // Fast
        return "User: Rohan Islam";
    };

    static Callable<String> adService = () -> {
        TimeUnit.MILLISECONDS.sleep(100);
        // Simulate random crash
        if (new Random().nextBoolean()) {
            throw new RuntimeException("Ad Server Down!");
        }
        return "Ad: Buy new Sony Headphones";
    };

    static Callable<String> analyticsService = () -> {
        TimeUnit.SECONDS.sleep(2); // Too slow! (Takes 2s)
        return "Analytics: You visited 5 pages";
    };
    // -------------------------------------------

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Requirement 1: Fetch User Profile. If it fails, print "Fatal Error" and exit.
        // Requirement 2: Fetch Ads. If it throws exception, use fallback "Ad: Default
        // Holiday Sale".
        // Requirement 3: Fetch Analytics. ENFORCE 1-second timeout. If timeout, use
        // "Analytics Unavailable".

        // HINT: You will need separate try-catch blocks for the future.get() calls
        // to handle the specific fallback logic for each component.

        Future<String> userTask = executor.submit(userProfileService);
        Future<String> adTask = executor.submit(adService);
        Future<String> analyticsTask = executor.submit(analyticsService);

        String userData = "",
                adData = "",
                analyticsData = "";

        try {
            userData = userTask.get();
        } catch (Exception e) {
            System.out.println("Fatal Error");
            System.exit(1);
        }

        try {
            adData = adTask.get();
        } catch (Exception e) {
            adData = "Ad: Default Holiday Sale";
        }

        try {
            analyticsData = analyticsTask.get(1, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            analyticsData = "Analytics Unavailable";
            analyticsTask.cancel(true);
        } catch (Exception e) {
            analyticsData = "Analytics Unavailable";
        }

        System.out.println("--- User Dashboard ---");
        System.out.println(userData);
        System.out.println(adData);
        System.out.println(analyticsData);

        executor.shutdown();
        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal Time: " + (endTime - startTime) + "ms");
    }
}
