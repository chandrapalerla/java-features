//import jdk.incubator.foreign.*;
//
//public class ForeignFunctionExample {
//    public static void main(String[] args) {
//        try (MemorySegment segment = MemorySegment.allocateNative(4)) {
//            MemoryAccess.setIntAtOffset(segment, 0, 42);
//            int value = MemoryAccess.getIntAtOffset(segment, 0);
//            System.out.println("Value from native memory: " + value);
//        }
//    }
//}
