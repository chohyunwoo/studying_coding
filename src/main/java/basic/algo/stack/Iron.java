package basic.algo.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Iron {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else { // c == ')'
                stack.pop();

                if (s.charAt(i - 1) == '(') {
                    // 레이저
                    result += stack.size();
                } else {
                    // 쇠막대기 끝
                    result += 1;
                }
            }
        }
    }
}


