package cond.ex;

public class ScoreEx {

    public static void main(String[] args) {
        int score = 90;
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Score: " + score);
        System.out.println("출력: 학점은 " + grade + "입니다.");
    }
}
