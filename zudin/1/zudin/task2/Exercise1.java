package zudin.task2;

public class Exercise1 {

	public static void main(String[] args) {
		long a = 17;
		long b = 94;

        checkValues(a,b);
    }

    static void checkValues(long a, long b) {

        if (a%2 == 0) {
            System.out.println("a + b = " + (a + b));
        }

        if (b%2 == 0) {
            System.out.println("a - b = " + (a - b));
        }

        if (a > 0) {
            System.out.println("a * b = " + (a * b));
        }

        if (b > 0) {
            System.out.println("a : b = " + (a / b));
        }
    }
}