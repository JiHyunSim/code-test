package com.example.test.programmers;

import org.junit.jupiter.api.Test;

class Test3Test {

    @Test
    void test1() {
        Test3 test3 = new Test3();
        int[] bankbook = {8, 4, 2, 5, 3, 7};
        long res = test3.solution(10, bankbook);
        System.out.println("" + res);
    }

    @Test
    void test2() {
        Test3 test3 = new Test3();
        int[] bankbook = {1,2,3,3,3,8};
        long res = test3.solution(10, bankbook);
        System.out.println("" + res);
    }


}