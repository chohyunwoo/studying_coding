package basic.algo.lecture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이번에도 방향성은 맞았으나 요금 계산방법이 틀렸었다.
     /*
        영식 30초마다 10원 => /30 가 아닌 30+1 *10
        민식 60초마다 15원 =? /60 아닌 60 + 1 *15
         */
public class Example8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int Ysum = 0;
        int Msum = 0;

        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(st.nextToken());

            Ysum += (T / 30+1) * 10;
            Msum += (T / 60+1) * 15;

        }
        if (Ysum == Msum){
            System.out.println("Y"+ " M " + Msum);
        } else if (Ysum < Msum) {
            System.out.println("Y " + Ysum);
        }else{
            System.out.println("M " + Msum);
        }

    }

}
