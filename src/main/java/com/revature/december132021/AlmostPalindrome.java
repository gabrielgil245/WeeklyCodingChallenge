package com.revature.december132021;

public class AlmostPalindrome {
    public static boolean almostPalindrome(String almost) {
        boolean result = true;
        StringBuilder palindome = new StringBuilder(almost);
        int counter = 0;

        for(int index = 1; index <= almost.length() / 2; index++) {
            if(almost.charAt(index - 1) != almost.charAt(almost.length() - index)) {
                counter++;
                if(counter < 2) {
                    palindome.setCharAt(palindome.length() - index, almost.charAt(index - 1));
                } else if(counter > 1) {
                    result = false;
                    break;
                }
            }
        }
        System.err.println(almost);
        System.err.println(palindome);
        System.err.println(result);
        return result;
    }

    public static void main(String[] args) {
        AlmostPalindrome.almostPalindrome("abcdcbg"); // true
        System.err.println();
        AlmostPalindrome.almostPalindrome("abccia"); // true
        System.err.println();
        AlmostPalindrome.almostPalindrome("abcdaaa"); // false
        System.err.println();
        AlmostPalindrome.almostPalindrome("1234312"); // false

    }
}
