public class ObjectLevelLock {
    static void  main(){
        Test t1 = new Test();
        Test t2 = new Test();

        new Thread(t1::method).start();
        new Thread(t2::method).start(); // runs simultaneously ✅
    }
}

class Test{
    synchronized void method() {
        System.out.println("Object-level lock");
    }
}
