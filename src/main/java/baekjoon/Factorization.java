package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//11653 소인수분해 (재귀 함수 사용)
public class Factorization {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        if (N == 1) return;

        // 재귀 함수 시작 (나누는 수 i는 2부터 시작)
        solve(N, 2);
    }

    public static void solve(int n, int i) {
        if (n == 1) return;

        // [최적화] 나누는 수 i의 제곱이 n보다 크면, 남은 n은 무조건 소수임
        // 이 조건이 없으면 n이 큰 소수일 때 재귀가 너무 깊어져서 에러가 남
        if (i * i > n) {
            System.out.println(n);
            return;
        }

        if (n % i == 0) {
            System.out.println(i);
            solve(n / i, i);
        }
        else {
            solve(n, i + 1);
        }
    }
}