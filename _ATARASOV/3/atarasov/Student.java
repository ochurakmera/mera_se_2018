package atarasov;

import java.util.Random;

public class Student {
    private static final Random random =  new Random(System.currentTimeMillis());
    String name = "Не поределено";
    private int mark;

    public Student(String name) {
        this.name = name;
        this.mark = Math.abs(random.nextInt() % 6);
    }

    public String getMark() {
        switch (mark) {
        case 0:
            return "Ужасно!";
        case 1:
            return "Оч. Плохо";
        case 2:
            return "Провал!";
        case 3:
            return "Плохо!";
        case 4:
            return "Хор!";
        case 5:
            return "Отл!";
        default:
            return "Непонятная оценка";
        }

    }

    public void sayHello() {
        System.out.println("ПРивет, я " + name);
    }

}
