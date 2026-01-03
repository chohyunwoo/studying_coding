package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1182
public class Partion {
    static int N ;
    static int S ;

    static int[] arr;
    static int count= 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

      arr = new int[N];

      st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

      dfs(0,0);

  //      if (S==0) count--;
        System.out.println(count);
    }

    // 배열의 끝까지 숫자들을 하나씩 대입하는 방법
    private static void dfs(int index,  int sum) {
        for (int i = index; i <N ; i++) {
            int nextSum = arr[i] + sum;
            if (nextSum==S){
                count++;
            }
            dfs(i+1 , nextSum);
        }

        // 배열의 끝에 도달할 때까지 두 갈래 길로 뻗는 방식
        //       if (a==N){
//           if (b==S){
//               count++;
//           }
//           return;
//       }

//       dfs(a+1,b +arr[a]);

//       dfs(a+1 , b);
    }

}
