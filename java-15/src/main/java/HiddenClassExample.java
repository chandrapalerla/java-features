import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public class HiddenClassExample {

  public static void main(String[] args) {
    Lookup lookup = MethodHandles.lookup();
    Class<?> hiddenClass = lookup.lookupClass();
    System.out.println("Hidden class created: " + hiddenClass);
  }
}
