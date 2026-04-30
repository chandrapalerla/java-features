void main() {
    AtomicReference<String> ref = new AtomicReference<>("Hello");

    ref.compareAndSet("Hello", "World");
    IO.println(ref.get()); // World
}