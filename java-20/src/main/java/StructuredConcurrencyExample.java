//import jdk.incubator.concurrent.StructuredTaskScope;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.Future;
//
//public class StructuredConcurrencyExample {
//    public static void main(String[] args) {
//        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
//            Future<String> task1 = scope.fork(() -> {
//                // Simulate some work
//                Thread.sleep(1000);
//                return "Result of Task 1";
//            });
//
//            Future<String> task2 = scope.fork(() -> {
//                // Simulate some work
//                Thread.sleep(2000);
//                return "Result of Task 2";
//            });
//
//            // Wait for all tasks to complete or fail
//            scope.join();
//            scope.throwIfFailed();
//
//            // Retrieve results
//            String result1 = task1.resultNow();
//            String result2 = task2.resultNow();
//
//            System.out.println(result1);
//            System.out.println(result2);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//    }
//}
