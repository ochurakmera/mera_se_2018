package atarasov;

public class lesson3 {
    public static void main(String[] args) {
        printNumber("Odin",1);
        printNumber("Odin-Cherture",1, 2, 3, 4);
        int[] numbers = { 1, 2, 3, 4 };
        printNumber("Text", numbers);
        printNumberArray("Odin-Cherture", numbers);
    }

    public static void printNumber(String prefix, int ... numbers) {
        System.out.println(prefix);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    public static void printNumberArray(String prefix, int [] numbers) {
        System.out.println(prefix);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
