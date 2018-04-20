package rybkin.task2;

import java.sql.SQLOutput;

public class Main2 {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, 3, 6, -15, -2, 8, 101, 12, -3, 150};
        int indMax = 0;
        int k=0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (indMax > 100) {
                    break;
                }
                else {
                    if (arrayInt[i] > indMax) {
                        indMax = arrayInt[i];
                        k = i;
                }
            }
        }
        System.out.println("индекс наибольшего элемента = " + k);
    }
}
