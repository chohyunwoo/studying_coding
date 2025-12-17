package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5622 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int totalTime = 0;

        for (char c : input.toCharArray()) {
            if (c <= 'C') totalTime += 3;
            else if (c <= 'F') totalTime += 4;
            else if (c <= 'I') totalTime += 5;
            else if (c <= 'L') totalTime += 6;
            else if (c <= 'O') totalTime += 7;
            else if (c <= 'S') totalTime += 8;
            else if (c <= 'V') totalTime += 9;
            else totalTime += 10;
        }

        System.out.println(totalTime);
    }
}