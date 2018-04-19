package terletskiy.task2;

public class Task2 {
    public static void main(String[] args) {
        // - У вас есть одно число (значения числа можно задать прямо в коде программы вручную)
        Integer number = 7;
        Integer counter = 0;
        Integer sum = 0;

        // - На экран нужно вывести все нечетные числа от 0 до введенного числа.
        while (counter++ < number)
        {
            System.out.print(counter%2!=0?counter + " ":"");
        }

        // - На экран нужно вывести сумму всех четных от 0 до введенного числа.
        counter = 0;
        while (counter++ < number)
        {
            sum += counter%2==0?counter:0;
        }
        System.out.print("\n" + sum);

        // Например, число 7.
        // На экран выводятся числа 1,3,5,7  (нечетные) и 12 как сумма четных  (2,4,6)
    }
}
