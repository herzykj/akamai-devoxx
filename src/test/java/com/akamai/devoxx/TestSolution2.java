package com.akamai.devoxx;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class TestSolution2 {

    @Test
    public void testSumAscii() {
        assert Solution2.sumAsciiInString("A") == 65;
        assert Solution2.sumAsciiInString("AAA") == 3*65;
        assert Solution2.sumAsciiInString("abc") == 97 + 98 + 99;
    }

}
