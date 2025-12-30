package cs;

public class ex3 {
    // 최대공약수(GCD) 함수
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 배열을 왼쪽으로 d칸 회전
    static void leftRotate(int[] arr, int d, int n) {

        d = d % n; // d가 n보다 큰 경우 대비

        for (int i = 0; i < gcd(d, n); i++) {

            int temp = arr[i];
            int j = i;

            while (true) {
                int k = j + d;
                if (k >= n) {
                    k = k - n;
                }

                if (k == i) {
                    break;
                }

                arr[j] = arr[k];
                j = k;
            }

            arr[j] = temp;
        }
    }

    // 배열 출력
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        leftRotate(arr, 2, n);
        printArray(arr);
    }
}
