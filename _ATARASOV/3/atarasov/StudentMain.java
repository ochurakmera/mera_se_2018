package atarasov;

public class StudentMain {

    public static void main(String[] args) {
        Student andrey = new Student("Андрей");
        Student petya = andrey;
        setName(petya,"Петя");
        System.out.println(andrey.name);

        Integer chislo = 2;
        setNumber(chislo);
        System.out.println(chislo);
    }

    public static void setNumber(Integer i) {
        i = new Integer(42);
    }

    public static void setName(Student student, String name) {
        student.name = name;
    }


}
