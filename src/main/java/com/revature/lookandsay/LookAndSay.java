package com.revature.lookandsay;

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
}
