package com.example.test.others;

public class Test2 {
    public String solution(int n){
        String answer = "";
        while(n >0) {
            char a = (char) ((n % 3) + '0');
            answer += (a == '0' ? '4':a);
            n = n/3;
        }
        return answer;
    }
}
