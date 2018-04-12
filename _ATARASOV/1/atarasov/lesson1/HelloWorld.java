package atarasov.lesson1;

public class HelloWorld {
    public static void main(String[] args) {
        Man petya = new Man("Petya", 42);
        Man vasya = new Man("Vasya", 17);

        System.out.println("Петя:" +petya.isAdult());
        System.out.println("Вася:" + vasya.isAdult());
    }

    public static class Man {
        String name;
        int age;

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Man(int age) {

        }
        public Man(String name) {
            this(name, 20);
        }

        public void sayHello() {
            System.out.println("Привет, я " + name);
        }

        public boolean isAdult() {
            return age >= 18;
        }
    }
}
