package com.revature.december062021;

/*
 Credit goes to Jeffrey Hantin (answered) & irrelephant (last edited)
 https://stackoverflow.com/questions/4201860/how-to-find-gcd-lcm-on-a-set-of-numbers
 Commit inserts were done by me, Gabriel Gil, in reviewing the code
 */
public class LCM {
    public static long greatestCommonDivisor(long a, long b)
    {
        while (b > 0) // when remainder is at 0, exit loop and return the greatest common divisor
        {
            long temp = b; // calculated remainder stored here
            b = a % b; // remainder is calculated
            a = temp; // prior remainder value is stored here
        }
        return a;
    }

    public static long greatestCommonDivisor(long[] input)
    {
        long result = input[0];
        for(int i = 1; i < input.length; i++) {
            // iterating through the list, while acquiring the greatest common divisor between two numbers
            result = greatestCommonDivisor(result, input[i]);
        }

        return result;
    }

    public static long lowestCommonMultiple(long a, long b)
    {
        // greatest common divisor divided to the second variable and multiplied to the first
        return a * (b / greatestCommonDivisor(a, b));
    }

    public static long lowestCommonMultiple(long[] input)
    {
        long result = input[0];
        for(int i = 1; i < input.length; i++) {
            // iterating through the list, while acquiring the lowest common multiple between two numbers
            result = lowestCommonMultiple(result, input[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        long[] sample = new long[] {5, 4, 6, 46, 54, 12, 13, 17};
        System.out.println(LCM.greatestCommonDivisor(21, 14)); // 7
        System.out.println(LCM.lowestCommonMultiple(21, 14)); // 42
        System.out.println(LCM.greatestCommonDivisor(sample)); // 1
        System.out.println(LCM.lowestCommonMultiple(sample)); // 2744820
    }
}
