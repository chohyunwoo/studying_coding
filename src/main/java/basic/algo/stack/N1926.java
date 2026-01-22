package basic.algo.stack;

import java.io .*;
import java.util .*;


public class N1926 {
        static int n, m;
        static int[][] map;
        static boolean[][] visited;

        // 상, 하, 좌, 우
        static int[] dx = {1, -1, 0, 0};
        static int[] dy = {0, 0, 1, -1};

        public static void main (String[]args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            map = new int[n][m];
            visited = new boolean[n][m];

            // 입력
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;    // 그림 개수
            int maxArea = 0;  // 가장 큰 그림 넓이

            // 전체 탐색
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    if (map[i][j] == 1 && !visited[i][j]) {
                        count++;
                        maxArea = Math.max(maxArea, bfs(i, j));
                    }
                }
            }

            System.out.println(count);
            System.out.println(maxArea);
        }

        static int bfs ( int x, int y){
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{x, y});
            visited[x][y] = true;

            int area = 1;

            while (!q.isEmpty()) {
                int[] cur = q.poll();

                for (int i = 0; i < 4; i++) {
                    int nx = cur[0] + dx[i];
                    int ny = cur[1] + dy[i];

                    // 범위 체크
                    if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                        area++;
                    }
                }
            }
            return area;
        }
    }


