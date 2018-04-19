package zudin.task2;

public class Exercise2 {

	public static void main(String[] args) {
		int a = 7;

		findOdd(a);
		summOfEven(a);
	}
	    static void findOdd(int a) {
	        for(int i = 0; i <= a; i++){
	            if(i%2 == 0) continue;
	            System.out.print(i+" ");
	        }
	        System.out.println();
	    }
	    static void summOfEven(int a) {
	        int sum = 0;
	        for(int i = 1; i <= a; i++){
	            if(i%2 != 0) continue;
	            sum = sum + i;
	        }
	        System.out.println("sum :" + sum);
	    }
	}
