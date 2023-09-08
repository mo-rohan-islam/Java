import java.util.Scanner;
import java.util.logging.Logger;

public class Yield {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Logger log = Logger.getLogger("Logger");
        String day = null;
        try (Scanner scan = new Scanner(System.in);) {
            System.out.print("Enter Day of Week: ");
            day = scan.nextLine();
        } catch (Exception e) {
            log.info("Error reading input!");
        }

        Day dayInput = null;
        try {
            dayInput = Enum.valueOf(Day.class, day.toUpperCase());
            System.out.println(Yield.calculate(dayInput));
        } catch (IllegalArgumentException e) {
            log.info("Incorrect input: " + day);
        }
    }

    public static String calculate(Day d) {
        return switch (d) {
            case SATURDAY, SUNDAY -> "Week-end";
            default -> {
                Integer remainingWorkDays = 5 - d.ordinal();
                yield remainingWorkDays.toString();
            }
        };
    }

}
