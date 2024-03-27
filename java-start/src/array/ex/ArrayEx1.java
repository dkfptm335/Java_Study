package array.ex;

import java.util.Scanner;

public class ArrayEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] students = new int[5];
        int sum = 0;
        double avg = 0.0;

        System.out.print("Input scores of five students: ");

        for (int i = 0; i < students.length; i++){
            students[i] = sc.nextInt();
        }

        sc.close();

        for (int student : students) {
            sum += student;
        }

        avg = (double) sum / students.length;

        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + avg);
    }
}
