package basic.algo.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로 탐색

public class N2178 {

    static int N, M;
    static int[][] map;
    static boolean[][] visited;

    // 상, 하, 좌, 우
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        // 입력 (한 줄씩 문자열로 받는 게 핵심)
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        // BFS는 딱 한 번, (0,0)에서 시작
        bfs(0, 0);

        // 도착 지점의 값 = 최단 거리
        System.out.println(map[N - 1][M - 1]);
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                // 범위 체크
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                // 갈 수 있는 길이고, 아직 방문 안 했으면
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;

                    // 거리 누적 (핵심)
                    map[nx][ny] = map[cur[0]][cur[1]] + 1;

                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
}
