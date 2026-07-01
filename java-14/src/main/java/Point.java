public record Point(int x, int y) implements Test{
    public int add() {
        return x + y;
    }

    @Override
    public boolean add(int a, int b) {
        System.out.println(a+b);
        return false;
    }
}
