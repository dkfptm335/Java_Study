package scanner;

import java.util.Scanner;

public class ScannetTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int num1, num2, num3;

        System.out.print("이름을 입력하세요: ");
        name = scanner.nextLine();

        System.out.print("숫자 3개를 입력하세요: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.println(">> 당신의 이름은 " + name + "입니다.");
        System.out.printf(">> 당신이 입력한 숫자는 %d, %d, %d 입니다\n", num1, num2, num3);

        scanner.close();
    }
}
