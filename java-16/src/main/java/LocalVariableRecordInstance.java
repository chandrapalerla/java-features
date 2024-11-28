public class LocalVariableRecordInstance {

  public static void main(String[] args) {
    Object obj = new Person("chandu", 25);
    if (obj instanceof Person(String x, int y)) {
      System.out.println(x);
      System.out.println(y);
    }
  }
}
