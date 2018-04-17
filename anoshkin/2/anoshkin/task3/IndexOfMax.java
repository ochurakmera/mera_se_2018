package anoshkin.task3;

public class IndexOfMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -20, 75, 101, 116};
        int max = array[0];
        int idx = 0;
        for (int i=1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                idx = i;
                if (max > 100) break;
            }
        }
        System.out.println(idx);
    }
}
