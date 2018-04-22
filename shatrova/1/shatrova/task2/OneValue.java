package task2;

public class OneValue {
    public static void main(String[] args) {
        int v = 51;
        int sum = 0;

        for (int a = 0; a <= v; a++) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println();

        for (int i = 0; i <= v; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
