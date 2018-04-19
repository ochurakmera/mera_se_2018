package terletskiy.task3;

public class Task3 {
    public static void main(String[] args) {
        // 3. Написать программу:
        // Есть массив типа int, размер 10 элементов. Все 10 элементов заполняются в коде программы вручную.
        // Нужно найти самый большой элемент в массиве и вывести его индекс. (А если два максимальных числа?)
        Integer arr[] = new Integer[]{1,5,10,2,3,3,3,3,3,-2};

        Integer indexOfMaxElement = 0;
        Integer maxValueOfElement = 0;
        
        for (Integer i = 0; i<arr.length; i++){
            if (arr[i] > 100)
            {
                break;
            }
            if (arr[i] > maxValueOfElement)
            {
                maxValueOfElement = arr[i];
                indexOfMaxElement = i;
            }
        }
        System.out.println(indexOfMaxElement);


        // Не забываем, что в массиве могут быть отрицательные числа!
        // Если в массиве встречается элемент больше 100, то числа после этого элемента не рассматриваются (используйте условный оператор и break)
        // Например,
        // Массив [1,5,10,2,3,3,3,3,3,-2] = должно выывести "2" - это индекс десятки. Не забываем, что индексы начинаются с нуля.

    }
}
