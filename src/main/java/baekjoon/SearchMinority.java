package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1978번 소수찾기 문제
public class SearchMinority {

    static boolean minority(int num){
        if (num <= 1) return false;
        if (num == 2) return  true;
        for (int i =2; i*i <= num; i++){
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count =0;

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (minority(x)){
                count++;
            }
        }
        System.out.println(count);
    }
}
