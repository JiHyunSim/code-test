package com.example.test.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {

    public int solution(int n, int[] bankbook) {
        int answer = 0;
        Arrays.sort(bankbook);
        List<Integer> sorted = new ArrayList<>();

        for (int i =0 ; i< bankbook.length; i++){
            sorted.add(bankbook[i]);
        }

        Collections.sort(sorted,Collections.reverseOrder());

        int total=sorted.size();

        while(!sorted.isEmpty()) {
            int max = sorted.remove(0);
            if(max > n) continue;


            for (int i=0;i<sorted.size();i++){
                int a=sorted.get(i);
                if(max+a<=n){
                    max += sorted.remove(i);
                    total--;
                }else
                {
                    continue;
                }

            }

        }
        answer = total;
        return answer;
    }





}
