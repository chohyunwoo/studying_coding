package baekjoon;

import java.util.Scanner;

public class NandM {
        public static int N, M;
        public static int[] arr;      // 숫자를 담을 접시
        public static boolean[] visit; // 숫자를 사용 중인지 체크할 장부

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            M = sc.nextInt();

            arr = new int[M];      // M개를 뽑을 거니까 크기는 M
            visit = new boolean[N + 1]; // 1부터 N까지 사용하니까 N+1

            // 첫 번째 칸(0번 인덱스)부터 채우기 시작하자!
            dfs(0);
        }

        public static void dfs(int depth) {
            // 1. [종료 조건] M개를 다 채웠나?
            if (depth == M) {
                for (int val : arr) {
                    System.out.print(val + " ");
                }
                System.out.println();
                return; // 다 채웠으니 이전 갈림길로 돌아가자
            }

            // 2. [반복문] 1부터 N까지 숫자 중 하나를 골라보자
            for (int i = 1; i <= N; i++) {
                // 아직 사용하지 않은 숫자라면?
                if (!visit[i]) {
                    visit[i] = true;  // 사용 중이라고 장부에 기록 (방문 체크)
                    arr[depth] = i;   // 현재 칸(depth)에 숫자 저장

                    dfs(depth + 1);   // 다음 칸(depth+1)을 채우러 더 깊이 들어감 (재귀)

                    // 3. [백트래킹 핵심] 자식 노드 방문이 끝나고 돌아오면
                    visit[i] = false; // "이제 이 숫자는 다시 써도 돼"라고 장부에서 지움
                }
            }
        }
    }

