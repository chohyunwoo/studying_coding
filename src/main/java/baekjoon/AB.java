package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//백준 12904
public class AB {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // S와 T가 줄바꿈으로 입력되므로 두 번 읽습니다.
        String S = br.readLine();
        String T = br.readLine();

        StringBuilder sb = new StringBuilder(T);

        // T의 길이가 S의 길이보다 큰 동안 계속 반복하며 깎아냅니다.
        while (sb.length() > S.length()) {
            // 1. 현재 마지막 글자를 확인합니다.
            char lastChar = sb.charAt(sb.length() - 1);

            // 2. 마지막 글자는 어떤 경우든 일단 제거합니다.
            sb.deleteCharAt(sb.length() - 1);

            // 3. 만약 지운 글자가 'B'였다면 문자열을 뒤집습니다.
            if (lastChar == 'B') {
                sb.reverse();
            }
            // 'A'인 경우는 제거만 하고 그대로 둡니다.
        }

        // 최종적으로 남은 문자열이 S와 같은지 확인합니다.
        if (sb.toString().equals(S)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}