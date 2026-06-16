package creatingthread;

public class CreatingThreadDemo {
    static void main(){
        MyThread thread = new MyThread();
        thread.start();
        Thread thread1 = new Thread(new MyThreadRunnable());
        thread1.start();
//uisng virtual thread
        Thread t = Thread.ofVirtual().start(()-> System.out.println("virtual threds"));
        t.run();
    }

}

// class extends Thread

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("My thread class");;
    }
}

class MyThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("implements runnable");
    }
}