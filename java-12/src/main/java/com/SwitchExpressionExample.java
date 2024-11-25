package com;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        String day = "SATURDAY";
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            case "CHANDU"->21;
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        System.out.println("Number of letters: " + numLetters);
    }
}
