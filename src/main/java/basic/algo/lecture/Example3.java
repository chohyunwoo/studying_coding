package basic.algo.lecture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 게임 몇판할건지 관련 로직
        for (int play = 0; play < 3; play++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int count = 0;
            // 윷의 숫자
            for (int i = 0; i < 4; i++) {
                int X = Integer.parseInt(st.nextToken());
                if (X == 0) {
                    count++;
                }
            }
            // 결과를 StringBuilder에 누적 후 한번에 출력하기 위함
            switch (count) {
                case 0: sb.append("E"); break;
                case 1: sb.append("A"); break;
                case 2: sb.append("B"); break;
                case 3: sb.append("C"); break;
                case 4: sb.append("D"); break;
            }
            sb.append('\n'); // 줄바꿈
        }
        System.out.print(sb);
    }
}