package anoshkin.task2;

public class OneNum {
    public static void main(String[] args) {
        int num = 7;
        int sum = 0;
        for (int i = 1; i <= num; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 2; i <= num; i+=2){
            sum += i;
        }
        System.out.print("Sum = " + sum);
    }
}
