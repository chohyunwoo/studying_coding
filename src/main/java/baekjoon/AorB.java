package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 16953
public class AorB {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long S = Long.parseLong(st.nextToken());
        long T = Long.parseLong(st.nextToken());

        int count = 1;

        while (T > S) {

            if (T % 10 == 1) {
                T /= 10;
            } else if (T % 2 == 0) {
                T /= 2;
            } else {
                break;
            }
            count++;
        }

        if (T == S) {
            System.out.println(count);
        } else {
            // B가 A보다 작아졌거나, 중간에 break로 빠져나온 경우
            System.out.println(-1);
        }
    }
}
