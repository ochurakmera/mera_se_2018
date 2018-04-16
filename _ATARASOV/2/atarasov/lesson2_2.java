package atarasov;

public class lesson2_2 {

    // тернарная операция
    public static void main(String[] args) {
     /*   if (true) {
            return "Привет!";
        } else {
            return "Пока";
        }*/

        System.out.println( true ? false?"asd":"asd" : "Пока");
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
