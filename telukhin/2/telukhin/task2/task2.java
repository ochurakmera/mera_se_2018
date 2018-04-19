package telukhin.task2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        inputCheck();
    }

    public static void inputCheck() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число больше 0: ");
        if (in.hasNextInt()) {
            int input = in.nextInt();
            if (input > 0) {
                evenPrint(input);
            } else {
                System.out.print("Число должнобыть больше 0!");
            }
        } else {
            System.out.println("Вы ввели не число!");
        }

    }


    public static void evenPrint(int a) {
        System.out.print("Нечетные числа: ");
        for (int i = 1; i <= a; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        evenSum(a);
    }

    public static void evenSum(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i += 2) {
            sum += i;
        }
        System.out.println("Сумма четных: " + sum);
    }


}
