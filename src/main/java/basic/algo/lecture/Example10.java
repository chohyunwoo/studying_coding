package basic.algo.lecture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 별찍기 -3
public class Example10 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

            //for문 사용한거
//        for (int i = 0; i < N ; i++) {
//            for (int j = 0; j <N -i ; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        while (N-- > 0){
            for (int i = 0; i < N + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
