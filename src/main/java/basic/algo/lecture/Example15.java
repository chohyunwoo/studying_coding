package basic.algo.lecture;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            // 왼쪽 별: i+1
            for (int j = 0; j < i + 1; j++) System.out.print("*");

            // 가운데 공백: 2*(N-i-1)
            for (int j = 0; j < 2 * (N - i - 1); j++) System.out.print(" ");

            // 오른쪽 별: i+1
            for (int j = 0; j < i + 1; j++) System.out.print("*");

            System.out.println();
        }

// 아래쪽 (i = N-2 ~ 0)
        for (int i = N - 2; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) System.out.print("*");
            for (int j = 0; j < 2 * (N - i - 1); j++) System.out.print(" ");
            for (int j = 0; j < i + 1; j++) System.out.print("*");
            System.out.println();
        }

    }
}
