package com.akamai.devoxx;

public class Solution2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Missing string as input param");
            return;
        }
        System.out.println(sumAsciiInString(args[0]));
    }

    static long sumAsciiInString(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        long sum = 0;
        for (byte aChar : str.getBytes()) {
            sum += aChar;
        }
        return sum;
    }
}
