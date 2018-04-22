package task2;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 3, 28, 5, 2, -14, 13, 6, 17, 19};
        int indexMax = 0;

        for (int v = 0; v < arr.length; v++) {

            if (arr[v] >= 100) {
                break;
            }

            if (arr[indexMax] < arr[v]) {
                indexMax = v;
            }
        }
        System.out.println(indexMax);
    }
}
