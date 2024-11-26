public class OuterClass {
    private String outerField = "Outer field";

    public class InnerClass {
        public void printOuterField() {
            // Accessing the private field of the outer class
            System.out.println(outerField);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        InnerClass inner = outer.new InnerClass();
        inner.printOuterField(); // Output: Outer field
    }
}
