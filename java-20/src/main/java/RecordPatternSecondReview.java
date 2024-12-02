public class RecordPatternSecondReview {
    public static void main(String[] args) {
        Person person = new Person("chandu", 28);

        if (person instanceof Person(String name, int age)) {
            System.out.println("name = " + name + ", age = " + age);
        } else {
            System.out.println("Not a Person Object");
        }
    }
}
