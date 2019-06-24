package com.akamai.devoxx;

public class Solution3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Missing string as input param");
            return;
        }
        System.out.println(fib(Integer.parseInt(args[0])));
    }

    static long fib(int n) {
        if (n <= 0) {
            return 1;
        }
        long first = 0, second = 1;
        while (n-- > 0) {
            second += first;
            first = second - first;
        }
        return first;
    }
}
