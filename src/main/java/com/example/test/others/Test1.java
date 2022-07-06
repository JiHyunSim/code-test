package com.example.test.others;

import java.util.Arrays;

public class Test1 {

    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long min = times[0];
        long max = times[times.length - 1] * n;
        long mid = 0;
        int persons = 0;

        //7,10,14,20,28,30
        //1,2,3,2,4,6,4,8,12
        //1,2,
        while (min < max) {
            persons = 0;
            mid = (min + max) / 2;

            for (int time : times) {
                persons += mid / time;
            }
            if (persons >= n){
                max =  mid;
            }else
            {
                min = mid + 1;
            }

        }
        return min;

    }
}
