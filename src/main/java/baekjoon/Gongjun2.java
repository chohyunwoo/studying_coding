package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gongjun2{
    // 1. 문제에서 주어진 n의 최대치가 123,456이므로 2n인 246,912까지 배열 생성
    // static으로 선언하여 프로그램 시작 시 딱 한 번만 만듭니다.
    static boolean[] isPrime = new boolean[246913];


    // 2. 체를 만드는 메서드 (배수들을 지워나가는 핵심 로직)
    static void makeSieve() {
    Arrays.fill(isPrime,true);

    isPrime[0] = isPrime[1]= false;

        // 2부터 시작해서 숫자의 제곱근까지만 확인
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                // i가 소수라면, i의 제곱수부터 시작하여 i씩 더해가며 배수를 지운다.
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // [중요] 입력을 받기 전에 미리 체를 한 번만 완성해둡니다.
        makeSieve();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line == null) break;

            StringTokenizer st = new StringTokenizer(line);
            if (!st.hasMoreTokens()) continue;

            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;

            int count = 0;

            // 3. n+1부터 2n까지 "배열의 값"만 확인하면 끝! (연산이 필요 없음)
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}