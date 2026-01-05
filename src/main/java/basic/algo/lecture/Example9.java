package basic.algo.lecture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 카드 역배치 10804
public class Example9 {
    static int[] Number = new int[21];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 20; i++) {
            Number[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            reverse(a,b);
        }

        for (int i = 1; i <=20; i++) {
            System.out.print(Number[i] + " ");
        }
    }

    public static void reverse(int a, int b) {
                while (a<b) {
                    int temp = Number[a];
                    Number[a] = Number[b];
                    Number[b] = temp;
                     a++;
                     b--;
                }

            }
        }

