import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println("size: " + list.size());

        for (int i = 0; i < 10; ++i) {
            list.add(i);
        }

        System.out.println("Size: " + list.size());

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("Object: " + iterator.next());
        }
    }
}
