package terletskiy.task1;

public class Task1 {
    public static void main(String[] args) {
        // -  У вас есть два числа типа Long (значения чисел можно задать прямо в коде программы)
        Long number1 = 12L, number2 = 10L;

        // - Если первое число четное, то вывести на экран сумму двух чисел
        System.out.print(number1%2==0?number1+number2 + "\n" : "");

        // - Если второе число четное, то вывести на экран разность двух чисел
        System.out.print(number2%2==0?number1-number2 + "\n" : "");

        // - Если первое число положительное, то вывести на экран произведение двух чисел.
        System.out.print(number1>0?number1*number2 + "\n" : "");

        // - Если второе число положительное, то вывести на экран частное двух чисел
        System.out.print(number2>0?number1/number2 + "\n" : "");
    }
}
