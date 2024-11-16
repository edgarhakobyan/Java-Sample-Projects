package longestcommonprefix;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        String[] strs = {"reflower","flow","flight"};
        System.out.println("longest substring " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String first = strs[0];
        for (int i = first.length(); i > 0; --i) {
            String sub = first.substring(0, i);
            boolean flag = true;
            for (int j = 1; j < strs.length; ++j) {
                String secondSub = strs[j].substring(0, sub.length());
                if (!sub.equals(secondSub)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return sub;
            }
        }
        return "";
    }
}
