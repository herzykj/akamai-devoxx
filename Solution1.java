package com.akamai.devoxx;

import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Missing file name as input param");
            return;
        }
        System.out.println(countPalindrome(new FileInputStream(args[0])));
    }


    static long countPalindrome(InputStream inputStream) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            return bufferedReader.lines().filter(Solution1::isPalindrome).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }


    static boolean isPalindrome(String line) {
        if (line == null || line.isEmpty()) {
            return false;
        }
        final int size = line.length();
        for (int i = 0; i < size; i++) {
            if (line.charAt(i) != line.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
