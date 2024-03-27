package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        int count = 0;

        while (true) {
            count += 2;

            if (count == 22) {
                break;
            }

            System.out.println(count);
        }
    }
}
