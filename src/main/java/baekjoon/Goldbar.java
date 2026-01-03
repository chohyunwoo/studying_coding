package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Goldbar {

    static boolean[] isPrime = new boolean[10001];


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        makefile();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0){

            int n = Integer.parseInt(br.readLine());

            solve(n);

        }
    }

    private static void solve(int n) {
        for (int i = n/2; i >=2 ; i--) {
            if (isPrime[i] && isPrime[n-i]){
                System.out.println( i + " " + (n-i));
                break;
            }
        }
    }

    private static void makefile() {

        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] =false;

        for (int i = 2; i * i<= 10000 ; i++) {
            if (isPrime[i]){
                for (int j = i*i; j <=10000; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
