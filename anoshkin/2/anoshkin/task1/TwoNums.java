package anoshkin.task1;

/*

1. Написать программу, которая делает следующее:
-  У вас есть два числа типа Long (значения чисел можно задать прямо в коде программы)
-  Если первое число четное, то вывести на экран сумму двух чисел
- Если второе число четное, то вывести на экран разность двух чисел
- Если первое число положительное, то вывести на экран произведение двух чисел.
- Если второе число положительное, то вывести на экран частное двух чисел.
Замечание: На экран может выводится больше одной записи (например, первое число 42 - и четное и положительное, на экран должны быть выведены сумма и произведение)

 */

public class TwoNums {
    public static void main(String[] args) {
        long First = 15L;
        long Second = 20L;
        if (First%2 == 0)  System.out.println(First + Second);
        if (Second%2 == 0) System.out.println(First - Second);
        if (First >= 0)    System.out.println(First * Second);
        if (Second >= 0)   System.out.println((double)First / Second);
    }
}
