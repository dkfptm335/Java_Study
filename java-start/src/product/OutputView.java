package product;

public class OutputView {
    public static void printProduct(Product product) {
        System.out.println(product.getName() + ": " + product.getPrice() + "원");
    }

    public static void printMenu() {
        System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

    public static void printExit() {
        System.out.println("프로그램을 종료합니다.");
    }

    public static void printNoMoreProducts() {
        System.out.println("더 이상 상품을 등록할 수 없습니다.");
    }

    public static void printInputName() {
        System.out.print("상품 이름을 입력하세요: ");
    }

    public static void printInputPrice() {
        System.out.print("상품 가격을 입력하세요: ");
    }

    public static void printNoProducts() {
        System.out.println("등록된 상품이 없습니다.");
    }
}
