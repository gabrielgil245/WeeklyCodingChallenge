package com.revature.december062021;

public class LookAndSay {
    public static Long lookAndSay(Long arr) {
        String integers = arr.toString();
        String result = "";
        if(integers.length() % 2 != 0) {
            return -1L;
        }

        int count = 0;
        for(int index = 0; index < integers.length(); index++) {
            if((index + 1) % 2 != 0) {
                /* Note: 'char value' (int value)
                 i.e. '5' (53) - '0' (48) = '51' (3) */
                count = (int) integers.charAt(index) - '0';
                continue;
            } for(int counter = 1; counter <= count; counter++) {
                result = result.concat(String.valueOf(integers.charAt(index)));
            }
        }
        return Long.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(LookAndSay.lookAndSay(1213200012171979L)); // 23002799999999
        System.out.println(LookAndSay.lookAndSay(95L)); // 555555555
        System.out.println(LookAndSay.lookAndSay(120520L)); // 200
        System.out.println(LookAndSay.lookAndSay(231L)); // -1
    }
}
