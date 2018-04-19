package telukhin.task3;

public class task3 {
    public static int[] array = {-4, -2, -1, -3, 8000, -8, -7, 0, -9};

    public static void main(String[] args) {
        findMax(array);
    }

    private static void findMax(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 100){
                break;
            } else {
                if (arr[maxIndex] < arr[i]) {
                    maxIndex = i;
                }
            }
        }
        System.out.println(maxIndex);
    }

}

