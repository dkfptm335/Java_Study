package product;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        Product[] products = new Product[10];
        Scanner scanner = new Scanner(System.in);
        // 상품 재고
        int inventory = 0;

        while (true) {
            int menu;

            OutputView.printMenu();
            menu = scanner.nextInt();
            if (menu == 3) { // 프로그램 종료
                OutputView.printExit();
                break;
            } else if (menu == 1) { // 상품 등록
                if (inventory == 10) { // 상품믈 더 이상 등록할 수 없는 경우
                    OutputView.printNoMoreProducts();
                } else {
                    OutputView.printInputName();
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    OutputView.printInputPrice();
                    int price = scanner.nextInt();
                    products[inventory] = new Product(name, price);
                    inventory++;
                }
            } else { // 상품 목록
                if (inventory == 0) { // 등록된 상품이 없는 경우
                    OutputView.printNoProducts();
                } else {
                    for (int i = 0; i < inventory; i++) {
                        OutputView.printProduct(products[i]);
                    }
                }
            }
        }
    }
}
