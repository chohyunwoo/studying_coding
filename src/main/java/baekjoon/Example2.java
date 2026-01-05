package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int Amount;

        // 숫자 세 개가 모두 같은 경우
        if (a == b && b == c) {
            Amount = 10000 + a * 1000;

            // 숫자 두 개만 같은 경우
        } else if (a == b || a == c) {
            Amount = 1000 + a * 100;
        } else if (b == c) {
            Amount = 1000 + b * 100;

            //  숫자 모두 다른 경우
        } else {
            int max = Math.max(a, Math.max(b, c));
            Amount = max * 100;
        }

        System.out.println(Amount);
    }
}
