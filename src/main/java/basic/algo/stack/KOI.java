package basic.algo.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
스택은 후입 선출 방식이라는 것을 명심하고 문제를 풀이하자
 */
public class KOI {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<int[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            int Top = Integer.parseInt(st.nextToken()); // 현재 탑의 높이

            // 현재 탑보다 낮은 왼쪽 탑들은
            // 지금 신호도 못 받고, 앞으로도 못 받으므로 제거
            while (!stack.isEmpty() && stack.peek()[1] < Top) {
                stack.pop();
            }
            //스택이 비어있으면 현재(top)보다 높은 탑이 없다는 의미
            if (stack.isEmpty()) {
                sb.append("0 ");
            }else{
                //스택의 맨 위 탑은 왼쪽에서 가장 가까운 더 높은 탑이다.
                sb.append(stack.peek()[0]).append(" ");
            }
            // 현재 탑을 이후에 들어올 탑들의 비교 대상으로 저장
            stack.push(new int[]{i, Top});
        }
        System.out.println(sb);
    }
}
