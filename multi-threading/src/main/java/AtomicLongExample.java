void main() {
    AtomicLong value = new AtomicLong(100);

    value.addAndGet(50);
    IO.println(value.get()); // 150
}