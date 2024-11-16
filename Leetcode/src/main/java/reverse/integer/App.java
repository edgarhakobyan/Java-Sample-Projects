package reverse.integer;

public class App {
    public static void main(String[] args) {
        System.out.println(reverse(321));
    }

    public static int reverse(int x) {
        int num = 0;
        while (x > 0) {
            int left = x % 10;
            num = num * 10 + left;
            System.out.println("num = " + num);
            x /= 10;
        }
        return num;
    }
}
