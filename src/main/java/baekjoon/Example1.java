package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        //오름차순 정력
//        Arrays.sort(arr);


        // 내림차순 출력하는 로직
//        for (int i = arr.length -1; i >=0 ; i--) {
//            System.out.print(arr[i] + " ");
//        }

        //오름 차순 출력하는 로직
//        for (int i : arr) {
//            System.out.print(i);
//        }

//오름차순 정렬 swap 방식 적용
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}

