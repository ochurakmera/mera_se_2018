package zudin.task2;

public class Exercise3 {

	public static void main(String[] args) {
        int[] m = {1,5,10,2,-3,3,101,3,200,-2};

        findMax(m);
    }

    static void findMax(int[] m){
        int max = m[0];
        for(int i = 0; i < m.length; i++){
            if(m[i] > 100) break;
        	if(m[i] > max){
                max = m[i];
            }
        }
        System.out.println("max: " + max);
    }
}