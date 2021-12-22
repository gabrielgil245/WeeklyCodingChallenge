package com.revature.december202021;

public class Pronic {

    public static boolean isHeteromecic(int number) {
        System.err.println(number);
        boolean answer = false;

        if(number == 0)
            answer = true;

        for(int integer = 0; integer < number; integer++) {
            if(integer * (integer + 1) == number) {
                answer = true;
                break;
            }
            if(integer * (integer + 1) > number) {
                break;
            }
        }

        System.err.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Pronic.isHeteromecic(0);
        Pronic.isHeteromecic(2);
        Pronic.isHeteromecic(7);
        Pronic.isHeteromecic(110);
        Pronic.isHeteromecic(136);
        Pronic.isHeteromecic(156);
    }
}
