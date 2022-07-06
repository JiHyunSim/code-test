package com.example.test.programmers;

public class Test1 {

    public int solution(String s) {
        int answer = 0;
        for (int i=0;i<s.length();i++){
            char first=s.charAt(i);
            if(first == 'a' || first =='z'){
                for (int j=i+1;j<s.length();j++){
                    char second = s.charAt(j);
                    if((first == 'a' && second == 'a') || (first=='z' && second =='z'))
                        break;
                    if((first == 'a' && second == 'z') || (first=='z' && second =='a')){
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }

}
