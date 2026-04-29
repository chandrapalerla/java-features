private static final ThreadLocal<Integer> local =
        ThreadLocal.withInitial(() -> 0);

void main() {

    Runnable task = () -> {
        local.set((int) (Math.random() * 100));
        IO.println(Thread.currentThread().getName()
                + " : " + local.get());
    };

    new Thread(task).start();
    new Thread(task).start();
}