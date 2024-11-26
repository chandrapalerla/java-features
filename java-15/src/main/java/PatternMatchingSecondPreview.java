public class PatternMatchingSecondPreview {
  public static void main(String[] args) {
    Object obj = "Hello, World!";
    if (obj instanceof String str) {
      System.out.println(str.toUpperCase());
    }
  }
}