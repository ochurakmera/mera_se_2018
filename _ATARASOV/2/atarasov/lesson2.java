package atarasov;

public class lesson2 {

    public static void main(String[] args) {
        // комментриай
        String s = "123";
        String[] names = new String[] {
                "World!",
                "Petya",
                "Andrey",
                "Sveta"
        };


        for (int j = 0; j < names.length; j++) {
            System.out.println(getLocalizedString(names[j]));
        }

        System.out.println("Привет \t  \"Андрей\"");

    }

    public static String getLocalizedString(String name) {
        if (name.equals("Andrey")) {
            return getRusString(name);
        } else {
            return getString(name);
        }
    }

    public static String getString(String name) {
        return "Hello, " + name + "!";
    }
    public static String getRusString(String name) {
        return "Привет, " + name + "!";
    }

}
