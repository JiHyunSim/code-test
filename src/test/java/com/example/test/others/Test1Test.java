package com.example.test.others;

import org.junit.jupiter.api.Test;

class Test1Test {

    @Test
    void test1() {
        Test1 test1 = new Test1();
        int [] times= {7,10};
        long res=test1.solution(6,times);
        System.out.println(""+res);
    }
}