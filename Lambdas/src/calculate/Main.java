package calculate;

public class Main {
    public static void main(String[] args) {
        Operation sum = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation div = (x, y) -> x / y;
        Operation multiple = (x, y) -> x * y;

        int resultAdd = sum.calculate(10, 20);
        int resultSub = sub.calculate(10, 20);
        int resultDiv = div.calculate(10, 20);
        int resultMultiple = multiple.calculate(10, 20);

        System.out.println(resultAdd);
        System.out.println(resultSub);
        System.out.println(resultDiv);
        System.out.println(resultMultiple);
    }
}

@FunctionalInterface
interface Operation {
    int calculate(int x, int y);

    // J8
    default void show() {
        System.out.println("hello");
    }

    static void print() {
        System.out.println("world");
    }

    private void test() {};
}
