package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main25206 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 등급 → 평점 매핑
        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalScore = 0.0;
        double totalCredit = 0.0;

        // 2. 입력 처리
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            st.nextToken(); // 과목명 (사용 안 함)
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            // 3. P 등급 제외
            if (grade.equals("P")) continue;

            // 4. 평점 조회
            double score = gradeMap.get(grade);

            totalScore += credit * score;
            totalCredit += credit;
        }

        // 5. 결과 출력
        System.out.println(totalScore / totalCredit);
    }
}