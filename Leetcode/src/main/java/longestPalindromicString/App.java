package longestPalindromicString;

import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    private static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        String longestSub = "";
        for (int i = 0; i < s.length(); ++i) {
            String sub1 = expand(s, i, i);
            System.out.println("sub1 = " + sub1);
            if (sub1.length() > longestSub.length()) {
                longestSub = sub1;
            }

            String sub2 = expand(s, i , i + 1);
            System.out.println("sub2 = " + sub2);
            if (sub2.length() > longestSub.length()) {
                longestSub = sub2;
            }

            if (longestSub.length() == s.length()) {
                return longestSub;
            }
        }
        return longestSub;
    }

    private static String expand(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            --left;
            ++right;
        }
        return str.substring(left+1, right);
    }

    public static String longestPalindrome2(String s) {
        if (s.length() < 2) {
            return s;
        }
        String longestSub = "";
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i + 1; j <= s.length(); ++j) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && longestSub.length() < sub.length()) {
                    longestSub = sub;
                }
            }
        }
        return longestSub;
    }

    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            ++start;
            --end;
        }
        return true;
//        String reveredStr = new StringBuilder(s).reverse().toString();
//        return s.equals(reveredStr);
    }


}
// tesset 0,5 1,4 2,3, 3,2