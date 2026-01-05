package basic.algo.lecture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example4 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int min = 0;

        // int min = Integer.MAX_VALUE; // 홀수 최솟값

        for (int i = 0; i < 7; i++) {
            int N = Integer.parseInt(br.readLine());

            if (N % 2 == 1) {
                sum += N;
                if (min == 0 || N < min) {
                    min = N;
                }
//                if (N < min) {
//                    min = N;
//                }
            }
        }
//        if (min == Integer.MAX_VALUE){
//            System.out.println(-1);
//        } else {
//            System.out.println(sum);
//            System.out.println(min);
//        }
        if (min == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
