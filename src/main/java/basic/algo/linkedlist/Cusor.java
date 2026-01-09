package basic.algo.linkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Cusor {
    /*
    - 입력하면 왼쪽 문자 삭제
    화살표 입력 < , > 로 주어짐
    커서의 위치를 움직일 수 있다면 오른쪽 1만큼 이동
    커서의 위치가 줄의 마지막이 아니라면, 커서 및 커머서 오른쪽에 있는 모든 문자는 오른쪽으로 한칸 이동
     toCharArray() <- 문자열 (String)을 문자(char) 배열로 변환하는 메서드
     */
    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder output = new StringBuilder();

            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                LinkedList<Character> list = new LinkedList<>();
                ListIterator<Character> cursor = list.listIterator();

                String input = br.readLine();

                for (char c : input.toCharArray()) {
                    switch (c) {
                        case '<':
                            if (cursor.hasPrevious()) {
                                cursor.previous();
                            }
                            break;

                        case '>':
                            if (cursor.hasNext()) {
                                cursor.next();
                            }
                            break;

                        case '-':
                            if (cursor.hasPrevious()) {
                                cursor.previous();
                                cursor.remove();
                            }
                            break;

                        default:
                            cursor.add(c);
                            break;
                    }
                }

                // 결과 문자열 만들기
                for (char c : list) {
                    output.append(c);
                }
                output.append('\n');
            }

            System.out.print(output);
        }
    }

}

