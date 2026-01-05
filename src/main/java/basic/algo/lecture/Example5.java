package basic.algo.lecture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// Math.max / Math.min 언제 사용? <- 입력 순서가 보장되지 않을때 + 구간 문제인데 실수 방지하고 싶을때 사용
public class Example5 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
           sum += arr[i];
        }

        // 메서드 사용한거
//        Arrays.sort(arr);

        //swap 방식 직접 구현한거
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }



        // 평균 , 중앙값(5개의 가운데 값은 인덱스 2번째)
        System.out.println(sum / 5);
        System.out.println(arr[2]);
    }
}
