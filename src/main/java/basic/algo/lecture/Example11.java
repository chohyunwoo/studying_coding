package basic.algo.lecture;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

//        int space = 0;
//        while (N-- > 0) {
//            for (int j = 0; i < space; i++) {
//                System.out.print(" ");
//            }
//
//            for (int i = 0; i < N + 1; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            space++;
//        }
    }
}
