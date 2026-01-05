package basic.algo.lecture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example17 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int idx = 0;

        int[] arr = new int[10];

        for (int i = 1; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }


}

