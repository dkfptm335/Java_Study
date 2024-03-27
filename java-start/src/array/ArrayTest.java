package array;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }
}
