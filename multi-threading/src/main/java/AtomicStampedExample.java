void main() {
    AtomicStampedReference<String> ref =
            new AtomicStampedReference<>("A", 1);

    int[] stampHolder = new int[1];
    String value = ref.get(stampHolder);

    boolean success = ref.compareAndSet(
            value, "B",
            stampHolder[0], stampHolder[0] + 1
    );

    IO.println("Updated: " + success);
}