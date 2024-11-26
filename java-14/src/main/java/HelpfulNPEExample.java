public class HelpfulNPEExample {
    public static void main(String[] args) {
        String str = null;
        try {
            str.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
            // Example Output: java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
        }
    }
}