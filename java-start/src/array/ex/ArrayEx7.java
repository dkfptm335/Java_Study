package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        int[][] students = new int[4][3];
        double[][] scores = new double[4][2];
        String[] subjects = {"국어", "영어", "수학"};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < students[i].length; j++) {
                System.out.print(subjects[j] + " 점수:");
                students[i][j] = sc.nextInt();
                scores[i][0] += students[i][j];
            }

            scores[i][1] = scores[i][0] / students[i].length;
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + (int) scores[i][0] + ", 평균: " + scores[i][1]);
        }


    }
}
