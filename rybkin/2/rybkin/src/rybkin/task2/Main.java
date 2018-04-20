package rybkin.task2;

public class Main {
    public static void main(String[] args) {
        long a = 42;
        long b = -3;
        if (a % 2 == 0) {
            System.out.println(a + b);
        }
        if (b % 2 == 0) {
            System.out.println(a - b);
        }
        if (a > 0) {
            System.out.println(a * b);
        }
        if (b > 0) {
            System.out.println(a / b);
        }
    }

}
