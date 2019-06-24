package com.akamai.devoxx;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class TestSolution1 {

    @Test
    public void testFindingPalindrome() {
        assert !Solution1.isPalindrome(null);
        assert !Solution1.isPalindrome("");
        assert Solution1.isPalindrome("a");
        assert Solution1.isPalindrome("aa");
        assert !Solution1.isPalindrome("ab");
        assert Solution1.isPalindrome("aba");
        assert Solution1.isPalindrome("kaak");
        assert Solution1.isPalindrome("kajak");
        assert Solution1.isPalindrome("iamakamai");
    }


    @Test
    public void testCountingPalindrome() {
        String stringBuffer = "ala\n" +
                "ma\n" +
                "kota\n" +
                "kajak\n" +
                "asdfghjklkjhgfdsa\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(stringBuffer.getBytes());
        assert Solution1.countPalindrome(inputStream) == 3;
    }
}
