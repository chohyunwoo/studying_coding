package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2609 최대공약수와 최소공배수
public class GcdAndLcm {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

         int c = gcd(A,B);
        int d  = lcm(A,B);

        StringBuilder sb = new StringBuilder();
        sb.append(c).append("\n");
        sb.append(d);

        System.out.println(sb.toString());

//        System.out.println(c);
//        System.out.println(d);
    }

    public static int gcd(int a , int b){
        if (b ==0) return a;
        return gcd(b ,a%b);
    }

    public static int lcm(int a, int b){
        return (a*b) / gcd(a,b);
    }
}
