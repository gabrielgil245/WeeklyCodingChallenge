package com.revature.december132021;

public class StaircaseOfRecursion {
    public static int waysToClimb(int height) {
        int prior = 0, results = 1, combination;
        if(height < 1) {
            return results;
        }
        /* waysToClimb follows a Fibonacci pattern,
         but requires an extra step,
         to account for the extra way to climb the stairs */
        for(int step = 2; step <= height + 1; step++) {
            combination = prior + results; // i.e. 0 + 1, 1 + 1, 1 + 2, 2 + 3
            prior = results; // i.e. 1, 1, 2, 3
            results = combination; // i.e. 1, 2, 3, 5
        }

        return results;
    }

    public static void main(String[] args) {
        System.err.println(StaircaseOfRecursion.waysToClimb(1)); // 1
        System.err.println(StaircaseOfRecursion.waysToClimb(2)); // 2
        System.err.println(StaircaseOfRecursion.waysToClimb(3)); // 3
        System.err.println(StaircaseOfRecursion.waysToClimb(4)); // 5
        System.err.println(StaircaseOfRecursion.waysToClimb(5)); // 8
        System.err.println(StaircaseOfRecursion.waysToClimb(6)); // 13
        System.err.println(StaircaseOfRecursion.waysToClimb(7)); // 21
        System.err.println(StaircaseOfRecursion.waysToClimb(8)); // 34
    }
}
