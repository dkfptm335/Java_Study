package array;

import java.util.Scanner;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            students[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(students[i]);
        }
    }
}
