import java.util.Calendar;
import java.util.Locale;

public class CalendarFactoryExample {
    public static void main(String[] args) {
        // Factory method returns a Calendar instance (e.g., GregorianCalendar)
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date and Time: " + cal.getTime());

        // You can get a calendar for a specific locale
        Calendar japanCal = Calendar.getInstance(Locale.JAPAN);
        System.out.println("Current Date and Time in Japan: " + japanCal.getTime());

        // You don't usually do this directly:
        // GregorianCalendar gc = new GregorianCalendar();
    }
}