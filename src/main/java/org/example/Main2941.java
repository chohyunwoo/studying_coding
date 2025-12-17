package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] croatia = {
                "c=", "c-", "dz=", "d-",
                "lj", "nj", "s=", "z="
        };

        for (String s : croatia) {
            input = input.replace(s, "*");
        }

        System.out.println(input.length());
    }
}
