package com.example.test.others;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TravelPathDfsTest {

    @Test
    void solution() {

        String[][] test={{"ICN","JFK"},{"HND","IAD"},{"JFK","HND"}};
        TravelPathDfs tpd=new TravelPathDfs();
        String [] res=tpd.solution(test);
        System.out.println(Arrays.toString(res));
    }

    @Test
    void solution2() {

        String[][] test={{"ICN","SFO"},{"ICN","ATL"},{"SFO","ATL"},{"ATL","ICN"},{"ATL","SFO"}};
        TravelPathDfs tpd=new TravelPathDfs();
        String [] res=tpd.solution(test);
        System.out.println(Arrays.toString(res));
    }

}