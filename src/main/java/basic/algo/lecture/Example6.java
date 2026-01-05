package basic.algo.lecture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//일곱 난쟁이 문제 <추후 재귀함수 버전으로 공부해볼수 있음>
public class Example6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[9];
        int[] result = new int[7];

        for (int i = 0; i < 9; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        boolean found = false;


        // 결론 : a와 b를 하나씩 가정을 하고 합이 100이 되면 종료, 합이 100이되면 가짜 난쟁이 찾았으므로 true로 설정해서 반복문을 종료한다.
        // 9명 중 2명(a, b)을 제외<가정> <a[0] 번째 기준잡고 하나씩 비교>
        for (int a = 0; a < 8 && !found; a++) {
            for (int b = a + 1; b < 9; b++) {
                int sum = 0;
                int idx = 0;

                // 나머지 7명 담기
                for (int c = 0; c < 9; c++) {
                    if (c != a && c != b) {
                        result[idx++] = num[c];
                        sum += num[c];
                    }
                }
                // 합이 100이면 종료
                if (sum == 100) {
                    found = true;
                    break;
                }
            }
        }

        // 진짜 난쟁이 배열 오름차순으로 정렬
        Arrays.sort(result);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
