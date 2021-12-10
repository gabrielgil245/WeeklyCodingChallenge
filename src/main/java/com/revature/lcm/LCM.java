package com.revature.lcm;

/*
 Credit goes to Jeffrey Hantin (answered) & irrelephant (last edited)
 https://stackoverflow.com/questions/4201860/how-to-find-gcd-lcm-on-a-set-of-numbers
 Commit inserts were done by me, Gabriel Gil, in reviewing the code
 */
public class LCM {
    public static long gcd(long a, long b)
    {
        while (b > 0) // when remainder is at 0, exit loop and return the greatest common divisor
        {
            long temp = b; // calculated remainder stored here
            b = a % b; // remainder is calculated
            a = temp; // prior remainder value is stored here
        }
        return a;
    }

    public static long gcd(long[] input)
    {
        long result = input[0];
        for(int i = 1; i < input.length; i++) {
            // iterating through the list, while acquiring the greatest common divisor between two numbers
            result = gcd(result, input[i]);
        }

        return result;
    }

    public static long lcm(long a, long b)
    {
        // greatest common divisor divided to the second variable and multiplied to the first
        return a * (b / gcd(a, b));
    }

    public static long lcm(long[] input)
    {
        long result = input[0];
        for(int i = 1; i < input.length; i++) {
            // iterating through the list, while acquiring the lowest common multiple between two numbers
            result = lcm(result, input[i]);
        }
        return result;
    }
}
