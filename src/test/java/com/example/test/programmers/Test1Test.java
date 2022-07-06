package com.example.test.programmers;

import org.junit.jupiter.api.Test;

class Test1Test {

    @Test
    void test1() {

        Test1 test1 = new Test1();
        String s = "abcz";
        long res = test1.solution(s);
        System.out.println("" + res);
    }


    @Test
    void test2() {

        Test1 test1 = new Test1();
        String s = "zabzczxa";
        long res = test1.solution(s);
        System.out.println("" + res);
    }

    @Test
    void test3() {

        Test1 test1 = new Test1();
        String s = "abcd";
        long res = test1.solution(s);
        System.out.println("" + res);
    }

    @Test
    void test4() {

        Test1 test1 = new Test1();
        String s = "abcza";
        long res = test1.solution(s);
        System.out.println("" + res);
    }

}