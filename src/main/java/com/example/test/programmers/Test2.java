package com.example.test.programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] stringValues = input.split(" ");
        int [] values = new int[stringValues.length+4];
        int n=2;
        values[0]=200;
        values[1]=200;
        try {
            for (String s : stringValues) {
                int a = Integer.parseInt(s);
                if (a < -200 || a > 200) throw new Exception("out of range");
                values[n++]=a;
            }
            values[n++]=200;
            values[n]=200;

        } catch (Exception e) {

            System.out.println("ERROR");
        }
        int cnt=0;
        int value=0;


    }


}
