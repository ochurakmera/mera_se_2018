package atarasov.sub;

import atarasov.Student;

public class SubMain {
    public static void main(String[] args) {
        Student andrey = new Student("Андрей");
       // andrey.mark = 4; недоступно, т.к. видимость по умолчанию.
    }
}
