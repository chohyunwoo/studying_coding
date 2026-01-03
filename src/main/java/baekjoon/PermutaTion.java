package baekjoon;

import java.util.Scanner;

public class PermutaTion {
    static int N;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        // 배열을 미리  채운다.
        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(0);
    }

    private static void dfs(int index) {
        // 2. 모든 인덱스의 자리가 결정되었다면 출력
        if (index == N) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println(); // 줄바꿈 추가
            return;
        }

        // 3. 현재 위치(index)와 바꿀 대상(i)을 결정합니다.
        // 현재 위치부터 끝까지의 숫자들 중 하나를 선택해 자리를 바꿉니다.
        for (int i = index; i < N; i++) {
            swap(index, i);      // 자리를 바꿈
            dfs(index + 1);      // 다음 자리 결정하러 이동
            swap(index, i);      // ★ 중요: 다시 원래대로 돌려놓음 (백트래킹)
        }
    }

    // 두 원소의 위치를 바꿔주는 함수
    private static void swap(int i, int j) {
        int temp = arr[i]; // 임시 저장소 temp
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
