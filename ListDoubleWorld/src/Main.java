import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; ++i) {
            String word = reader.readLine();
            arrayList.add(word);
        }

        for (int i = 0; i < 5; ++i) {
            System.out.println(arrayList.get(i));
        }

        for (int i = 0; i < 5; ++i) {
            String str = arrayList.get(i);
            String newStr = doubleValues(str);
            System.out.println(newStr);
            arrayList.set(i, newStr);
        }

        System.out.println("================");

        for (int i = 0; i < 5; ++i) {
            System.out.println(arrayList.get(i));
        }
    }

    public static String doubleValues(String str) {
        int size = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; ++i) {
            stringBuffer.append(str.charAt(i));
            stringBuffer.append(str.charAt(i));
        }
        return stringBuffer.toString();
    }
}
