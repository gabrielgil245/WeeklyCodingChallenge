package com.revature.december202021;

public class Happy {
    public static boolean isHappy(int number) {
        boolean answer = false;
        String temp = String.valueOf(number);
        char[] numbers = temp.toCharArray();
        int[] integers = new int[numbers.length];

        System.err.println(numbers[0]);
        System.err.println(Character.getNumericValue(numbers[0]) * Character.getNumericValue(numbers[0]));

        for(int index = 0; index < numbers.length; index++) {
            integers[index] = Character.getNumericValue(numbers[index]) * Character.getNumericValue(numbers[index]);
            System.err.println(Character.getNumericValue(integers[index]));
        }

        return answer;
    }

    public static void main(String[] args) {
        Happy.isHappy(203);
    }
}
