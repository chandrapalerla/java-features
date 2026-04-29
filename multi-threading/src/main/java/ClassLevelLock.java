public class ClassLevelLock {

    static void main() {
        new Thread(ClassLock::method).start();
        new Thread(ClassLock::method).start();
    }
}

class ClassLock {
    static synchronized void method() {
        System.out.println("Class :: level lock");
    }
}
