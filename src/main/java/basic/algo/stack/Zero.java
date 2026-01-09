package basic.algo.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int N = Integer.parseInt(br.readLine());

            if (N == 0){
                stack.pop();
            } else  {
                stack.push(N);
            }
        }

        int sum = 0;
        // 위에서  0일때 제거한 이후 값이 남아있는 것들을 제거하면서 sum에 더하는 로직
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
