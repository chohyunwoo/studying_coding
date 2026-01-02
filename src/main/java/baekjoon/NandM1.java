package baekjoon;

import java.util.Scanner;

public class NandM1 {
    public static int N, M;
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        visit = new boolean[N + 1];

        // 0번 인덱스부터 채우기 시작하고, 숫자는 1부터 선택 가능하도록 넘겨줌
        dfs(1, 0);
    }

    // start: 반복문을 시작할 숫자를 알려주는 매개변수 추가
    public static void dfs(int start, int depth) {
        // 1. [종료 조건] M개를 다 채웠나?
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        // 2. [반복문] i를 1이 아닌 'start'부터 시작하게 바꿉니다.
        // 이렇게 하면 이전에 고른 숫자보다 작은 숫자는 쳐다보지도 않게 됩니다.
        for (int i = start; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i;

                // 다음 칸을 채울 때는 현재 고른 숫자(i)보다 1 큰 숫자부터 시작하게 합니다.
                dfs(i + 1, depth + 1);

                visit[i] = false;
            }
        }
    }
}