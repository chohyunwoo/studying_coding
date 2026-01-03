package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
//6588 골드바흐
public class GoldBar2 {

    static boolean[] isPrime = new boolean[1000001];


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        makefile();

      while (true){
          int n = Integer.parseInt(br.readLine());
          if (n == 0) break;
          solve(n);
      }

    }

    private static void solve(int n) {
        for (int i = 3; i <= n/2  ; i+=2) {
            if (isPrime[i] && isPrime[n - i]) {
                System.out.println(n + " = " + i + " + " + (n - i));
                return;
            }
        }
                System.out.println("Goldbach's conjecture is wrong");
    }

    // 이 로직이 에라토스테네스의 체의 핵심 로직 (소수를 미리 찾는 로직이다.)
    private static void makefile() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] =false;

        for (int i = 2; i * i<= 1000000 ; i++) {
            if (isPrime[i]){
                for (int j = i*i; j <=1000000; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
