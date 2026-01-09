package basic.algo.linkedlist;

import java.io.*;
import java.util.*;

/*
hasPrevious() <- 왼쪽에 문자가 있는지 확인하는 메서드 , 반환값으로 true, flase
previous() <- 커서를 왼쪽으로 한칸 이동 , 이동한 문자를 반환
hasNext() <- 오른쪽에 문자가 있는지 확인
next() <- 오른쪽으로 한칸 이동, 이동한 문자를 반환
remove() <-  마지막으로 접근한 문자 삭제 , 반드시 previous() 또는 next() 이후에만 사용 가능
 */

public class LinkedList {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        java.util.LinkedList<Character> list = new java.util.LinkedList<>();
        String str = br.readLine();

        // 초기 문자열 삽입
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        // 커서는 맨 뒤
        ListIterator<Character> cursor = list.listIterator(list.size());

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String cmd = br.readLine();
            char op = cmd.charAt(0);

            switch (op) {
                case 'L':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                    }
                    break;

                case 'D':
                    if (cursor.hasNext()) {
                        cursor.next();
                    }
                    break;

                case 'B':
                    if (cursor.hasPrevious()) {
                        // remove는 마지막으로 접근한 요소를 삭제한다. 따라서 왼쪽문자로 이동하고 그 문자를 삭제한다.
                        cursor.previous();
                        cursor.remove();
                    }
                    break;

                case 'P':
                    cursor.add(cmd.charAt(2));
                    break;
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }

        System.out.println(sb);
    }
}
