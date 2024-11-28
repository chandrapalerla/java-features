public class PatternMatchingForSwitchPreview {

  public static void main(String[] args) {
    Object obj = 123;
    String result = switch (obj) {
      case Integer i -> "Integer " + i;
      case String s -> "String " + s;
      case null -> "Null";
      default -> "Unknown type";
    };

    System.out.println(result); // Output: Integer 123
  }

}
