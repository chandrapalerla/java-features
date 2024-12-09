class Base {
    private int baseValue;

    public Base(int baseValue) {
        this.baseValue = baseValue;
    }
}

public class StatementBeforeSupperThis extends Base {
    private static final int THRESHOLD = 10;
    private int derivedValue;

    public StatementBeforeSupperThis(int inputValue) {
        // Preliminary check before calling the superclass constructor
        if (inputValue > THRESHOLD) {
            inputValue = THRESHOLD;
        }

        // Now call the superclass constructor
        super(inputValue);

        // Further initialization in the subclass
        this.derivedValue = inputValue * 2;
    }

    public static void main(String[] args) {
        StatementBeforeSupperThis d = new StatementBeforeSupperThis(15);
        System.out.println("Derived object created with adjusted value.");
    }
}
