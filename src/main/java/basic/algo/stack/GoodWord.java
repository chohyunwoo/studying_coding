package basic.algo.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class GoodWord {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int goodCount = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (char c : word.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();   // 짝 제거
                } else {
                    stack.push(c);
                }
            }

            if (stack.isEmpty()) {
                goodCount++;
            }
        }

        System.out.println(goodCount);
    }
}