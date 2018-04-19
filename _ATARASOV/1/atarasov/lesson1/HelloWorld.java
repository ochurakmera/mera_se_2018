package atarasov.lesson1;

public class HelloWorld {
    public static void main(String[] args) {
        String text = "andrey";


    }



    public String getGreeting(String name) {
        switch (name) {
        case "andrey":
            return "Привет";
        default:
            return "Hello!";
        }
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
