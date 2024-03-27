import java.util.Scanner;

public class Main {
    static int count_0 = 0, count_1 = 0;

    public static int fibonacci(int n) {


        if (n == 0) {
            count_0++;
            return 0;
        } else if (n == 1) {
            count_1++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            count_0 = 0;
            count_1 = 0;
            int n = sc.nextInt();
            fibonacci(n);
            System.out.println(count_0 + " " + count_1);
        }
        sc.close();
    }
}
