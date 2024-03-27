package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double avg = 0.0;

        System.out.println("Input 5 integers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        avg = (double) sum / numbers.length;

        System.out.println("Sum of integers: " + sum);
        System.out.println("Average of integers: " + avg);
    }
}
