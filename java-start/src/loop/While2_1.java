package loop;

public class While2_1 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        while (count <= 3) {
            count++;
            sum += count;
        }

        System.out.println("sum = " + sum);
    }
}
