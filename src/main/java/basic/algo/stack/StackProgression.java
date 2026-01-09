package basic.algo.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackProgression {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int top = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            while (top < num) {
                top++;
                stack.push(top);
                sb.append("+\n");
            }
            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
