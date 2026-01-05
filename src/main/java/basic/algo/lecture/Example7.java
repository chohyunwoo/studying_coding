package basic.algo.lecture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10093번 숫자 , 방향성은 잘 잡았으나 순서 보정 이 없어서 틀렸었음
// 10^9  → int
//10^12 → long
//10^18 → long (무조건)
public class Example7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        // A, B 순서 보정, 필요한 이유 <작은 수가 먼저 온다는 보장이 없다.>
        if (A > B) {
            long temp = A;
            A = B;
            B = temp;
        }

        long count = 0;
        StringBuilder sb = new StringBuilder();

        for (long i = A + 1; i < B; i++) {
            sb.append(i).append(" ");
            count++;
        }

        System.out.println(count);
        System.out.print(sb);
    }
}


/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long min = Math.min(A, B);
        long max = Math.max(A, B);

        long count = Math.max(0, max - min - 1);
        System.out.println(count);

        StringBuilder sb = new StringBuilder();
        for (long i = min + 1; i < max; i++) {
            sb.append(i).append(" ");
        }

        System.out.print(sb.toString());


 */