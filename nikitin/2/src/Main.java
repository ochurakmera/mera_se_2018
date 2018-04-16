package src;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1()
    {
        System.out.println("###### Task 1 #######");
        Long a = new Long(-111);
        Long b = new Long(222);

        if (a%2 == 0) {
            System.out.println("a+b=" + (a + b));
        }
        if (b%2 == 0) {
            System.out.println("a-b=" + (a - b));
        }
        if (a > 0) {
            System.out.println("a*b=" + (a * b));
        }
        if (b > 0) {
            System.out.println("a/b=" + (a / b));
        }
    }

    private static void task2()
    {
        System.out.println("###### Task 2 #######");

        //1
        int a = 7;
        int i = 1;
        while (i<=a) {
            System.out.print(i + ((a-i < 2) ? "\n" : " "));
            i+=2;
        }

        //2
        int tmp = a;
        if (a%2 == 1) tmp--; //ближайшее четное

        System.out.println("Sum from 0 to " + a + " is " + (tmp/2 * (tmp/2 + 1)));
    }

    private static void task3()
    {
        System.out.println("###### Task 3 #######");

        int[] arr = new int[] {1,6,9,-4,10,-9,2,3,3,0};
        int max = arr[0];
        int imax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
                if (max > 100) break;
            }
        }
        System.out.println("Index: " + imax);
    }
}
