package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1157 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        int max = 0;
        char result = '?';

        for (char c = 'A'; c <= 'Z'; c++) {
            int cnt = 0;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    cnt++;
                }
            }

            if (cnt > max) {
                max = cnt;
                result = c;
            } else if (cnt == max && cnt != 0) {
                result = '?';
            }
        }

        System.out.println(result);
    }

}
