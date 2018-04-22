package task2;

public class LongValue {
    public static void main (String [] args) {
        Long v1 = 165L;
        Long v2 = 28L;

        if (v1 % 2 == 0) {
            System.out.println(v1+v2);
        }
        if (v2 % 2 == 0) {
            System.out.println(v1-v2);
        }
        if (v1 > 0) {
            System.out.println(v1*v2);
        }
        if (v2 > 0) {
            System.out.println(v1/v2);
        }
    }
}
