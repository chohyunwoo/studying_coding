package basic.algo.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Stack;

/*
i번째 +1~~~ 하는데 높이가 현재보다 높으면 못봐
 */
public class Roof {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<int[]> stack = new Stack<>();

        int count = 0;

        for (int i = 1; i <= N; i++) {
            int height = Integer.parseInt(br.readLine());

            // 현재 건물 보다 낮거나 같으면 제거
            while (!stack.isEmpty() && stack.peek()[1] <= height) {
                stack.pop();
            }
            count += stack.size();

            stack.push(new int[]{i, height});
        }
        System.out.println(count);
    }
}
