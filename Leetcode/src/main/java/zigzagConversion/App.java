package zigzagConversion;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        System.out.println(convert(str, 4));
    }

    public static String convert(String s, int numRows) {
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
            stringBuilders[i] = new StringBuilder();
        }

        char[] chars = s.toCharArray();
        int index = 0;
        int length = chars.length;

        while (index < length) {
            for (int i = 0; i < numRows && index < length; ++i) {
                stringBuilders[i].append(chars[index++]);
            }

            for (int j = numRows - 2; j > 0 && index < length; --j) {
                stringBuilders[j].append(chars[index++]);
            }
        }

        StringBuilder stringBuilder = new StringBuilder(stringBuilders[0]);
        for (int i = 1; i < numRows; ++i) {
            stringBuilder.append(stringBuilders[i]);
        }

        return stringBuilder.toString();
    }
}
