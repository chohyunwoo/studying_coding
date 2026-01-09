package basic.algo.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BigNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int A = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        /*
         * 스택에는 [인덱스, 값] 형태로 저장
         * 의미:
         *  - 아직 "오큰수"를 찾지 못한 원소들만 보관
         *  - 스택에 남아 있다는 것은 오른쪽에서 더 큰 수를 아직 못 만났다는 뜻
         */
        Stack<int[]> stack = new Stack<>();
        /*
         * 결과 저장 배열
         * answer[i] = i번째 원소의 오큰수
         */
        int[] answer = new int[A]; // 결과 저장 배열

        // → 끝까지 오른쪽에 더 큰 수가 없으면 -1이 그대로 정답
        for (int i = 0; i < A; i++) {
            answer[i] = -1;
        }

        /*
         * 왼쪽 → 오른쪽으로 수열을 하나씩 확인
         * i : 배열 인덱스
         * X : 현재 보고 있는 값 (현재 원소)
         */
        for (int i = 0; i < A; i++) {
            int X = Integer.parseInt(st.nextToken());

            /*
             * 현재 값 X가
             * 스택에 있는 값들보다 크다면
             * → X는 그 값들의 "오큰수"가 된다
             *
             * 그래서:
             * 1. 스택에서 이전 값(prev)을 꺼내고
             * 2. 그 값이 있던 위치(prev[0])의 정답을 X로 확정
             *
             * while인 이유:
             * → X 하나로 여러 개의 오큰수가 한 번에 확정될 수 있기 때문
             */
            while (!stack.isEmpty() && stack.peek()[1] < X) {
                int[] prev = stack.pop(); // 오큰수를 못 찾고 대기 중이던 이전 값
                answer[prev[0]] = X;   // 그 이전 값의 오큰수를 X로 저장
            }
            /*
             * 현재 값 X는
             * 아직 오큰수를 못 찾았으므로
             * 스택에 후보로 등록
             */
            stack.push(new int[]{i, X});

        }
        /*
         * 결과 출력
         * - 오큰수를 찾은 값은 저장된 값 출력
         * - 끝까지 못 찾은 값은 -1 그대로 출력
         */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A; i++) {
            sb.append(answer[i]).append(" ");
        }
        System.out.print(sb);
    }
}
