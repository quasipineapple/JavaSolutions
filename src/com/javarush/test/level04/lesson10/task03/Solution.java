package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 123
 * Created by skvorcov on 13.08.2015.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int j = Integer.parseInt(br.readLine());
        int i = 0;
        while (i++ < j)
            System.out.println(s);


    }
}
