package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 백준 25206
public class University {
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5); gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5); gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5); gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5); gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalScore = 0;
        double totalCredits = 0;

        for(int i = 0 ; i<20; i++){
            String line = br.readLine();

            StringTokenizer st = new StringTokenizer(line);

            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(!grade.equals("P")){
                totalScore += (credit * gradeMap.get(grade));
                totalCredits += credit;
            }

        }
        if(totalCredits != 0){
            System.out.printf("%.6f\n", totalScore / totalCredits);
        }else{
            System.out.println("0.000000");
        }

    }
}
