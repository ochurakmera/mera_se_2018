package atarasov.lesson1;

public class HelloWorld {
    public static void main(String[] args) {
        int i = 2_222_222_22;
        short d = (short)i;
        System.out.println(d);
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
