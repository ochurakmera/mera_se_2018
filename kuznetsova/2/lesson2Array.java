public class lesson2Array {
    public static void main (String[] args) {
        int[] array =  {1,5,77,2,3,76,3,3,3,-2};
        int maxIndex = 0;
        for ( int i = 0; i < array.length; i++) {
            if (array[i] > 100) {
                break;
            }
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
            System.out.println(maxIndex);


    }


}
