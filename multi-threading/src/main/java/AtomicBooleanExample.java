void main() {
    AtomicBoolean flag = new AtomicBoolean(false);

    if (flag.compareAndSet(false, true)) {
        IO.println("Executed only once!");
    }
}