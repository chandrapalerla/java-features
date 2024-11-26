public class SwitchExpressionSecondPreview {
    public static void main(String[] args) {
        String day = "WEDNESDAY";
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> {
                System.out.println("Mid-week day");
                yield 9;
            }
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };

        System.out.println("Number of letters in " + day + " is " + numLetters);
    }
}
