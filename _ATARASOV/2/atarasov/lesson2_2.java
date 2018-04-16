package atarasov;

public class lesson2_2 {

    public static void main(String[] args) {
        // &&, || - короткий цикл вычислений
        // &,| - всегда вычисляет аргументы
        System.out.println( getFalse() && getTrue());
        System.out.println(getTrue() | getFalse());
    }

    private static boolean getTrue() {
        System.out.println("Returning true");
        return true;
    }

    private static boolean getFalse() {
        System.out.println("Returning false");
        return false;
    }

}
