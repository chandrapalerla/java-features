//import jdk.incubator.concurrent.ScopedValue;
//
//public class ScopedValueExample {
//    private static final ScopedValue<String> SCOPED_VALUE = ScopedValue.newInstance();
//
//    public static void main(String[] args) {
//        SCOPED_VALUE.enter("Hello, Scoped Value!", () -> {
//            System.out.println("Scoped Value: " + SCOPED_VALUE.get());
//        });
//    }
//}
