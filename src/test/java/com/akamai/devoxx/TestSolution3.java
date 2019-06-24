package com.akamai.devoxx;

import org.junit.Test;

public class TestSolution3 {

    @Test
    public void testSumAscii() {
        assert Solution3.fib(0) == 1;
        assert Solution3.fib(1) == 1;
        assert Solution3.fib(2) == 1;
        assert Solution3.fib(3) == 2;
        assert Solution3.fib(4) == 3;
        assert Solution3.fib(5) == 5;
        assert Solution3.fib(6) == 8;
        assert Solution3.fib(7) == 13;
        assert Solution3.fib(8) == 21;
        assert Solution3.fib(9) == 34;
        assert Solution3.fib(10) == 55;
        assert Solution3.fib(11) == 89;
        assert Solution3.fib(12) == 144;
    }

}
