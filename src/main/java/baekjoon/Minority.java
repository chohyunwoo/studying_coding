package baekjoon;

import java.io.*;
import java.util.*;

//1929번 문제
public class Minority {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 소수 여부 배열
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);

        // 0, 1은 소수 아님
        isPrime[0] = false;
        isPrime[1] = false;

        //  체 적용
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        //  출력
//        StringBuilder sb = new StringBuilder();
//        for (int i = M; i <= N; i++) {
//            if (isPrime[i]) {
//                sb.append(i).append('\n');
//            }
//        }
        for (int i = M ; i <=N; i ++){
        if (isPrime[i]){
            System.out.println(i);
        }
        }


//        System.out.print(sb);
    }
}
