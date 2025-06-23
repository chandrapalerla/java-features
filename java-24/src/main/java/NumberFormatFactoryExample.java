import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatFactoryExample {
    public static void main(String[] args) {
        double value = 123456.789;

        // Factory method returns a default NumberFormat based on the default locale
        NumberFormat defaultFormat = NumberFormat.getInstance();
        System.out.println("Default Format: " + defaultFormat.format(value));

        // Factory method returns a currency-specific NumberFormat for a given locale
        NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US Currency: " + usCurrencyFormat.format(value));

        // Factory method returns a percentage-specific NumberFormat for a given locale
        NumberFormat ukPercentFormat = NumberFormat.getPercentInstance(Locale.UK);
        System.out.println("UK Percent: " + ukPercentFormat.format(0.75));
    }
}