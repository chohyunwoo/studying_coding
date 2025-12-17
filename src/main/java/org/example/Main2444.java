package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2444 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //위쪽 삼각형
        for (int i = 1; i <= N; i++) {
            // 공백
            for (int j =1; j<=N-i; j++){
                System.out.print(" ");
            }
            // 별
            for (int j = 1; j<=2 *i  -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //아래쪽 삼각형
        for (int i = N - 1; i >= 1; i--) {
            // 공백
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
