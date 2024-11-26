import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatExample {
    public static void main(String[] args) {

        NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.FRENCH, NumberFormat.Style.SHORT);
        NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.FRENCH, NumberFormat.Style.LONG);

        System.out.println(shortFormat.format(1000000));
        System.out.println(longFormat.format(10000000));

    }
}
