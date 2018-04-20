package rybkin.task2;

public class Main1 {
    public static void main(String[] args) {
        int a = 25;
        int i;
        int k=0;
        for ( i=0; i < a; i++) {
            if (i % 2 == 0){
                k+=i;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Sum for all even = "+k);
    }
}
