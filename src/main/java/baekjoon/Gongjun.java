package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 4948번 베르트랑 공준
public class Gongjun {


    static boolean number(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line == null) break; // 1. 읽어온 줄이 null이면 중단 (파일 끝 처리)

            StringTokenizer st = new StringTokenizer(line);
            if (!st.hasMoreTokens()) continue; // 2. 읽을 숫자가 없으면 다음 줄로 이동

            int n = Integer.parseInt(st.nextToken());

            if (n == 0) break;

            int count = 0;

            for (int i = n+1 ; i <= 2 * n; i++) {
                if (number(i)){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
