package com.revature;

import com.revature.lcm.LCM;
import com.revature.lookandsay.LookAndSay;

public class Main {
    public static void main(String[] args) {
        long[] sample = new long[] {5, 4, 6, 46, 54, 12, 13, 17};

        System.out.println(LCM.gcd(21, 14)); // 7
        System.out.println(LCM.lcm(21, 14)); // 42
        System.out.println(LCM.gcd(sample)); // 1
        System.out.println(LCM.lcm(sample)); // 2744820
        System.out.println();
        System.out.println(LookAndSay.lookAndSay(1213200012171979L)); // 23002799999999
        System.out.println(LookAndSay.lookAndSay(95L)); // 555555555
        System.out.println(LookAndSay.lookAndSay(120520L)); // 200
        System.out.println(LookAndSay.lookAndSay(231L)); // -1
    }
}
