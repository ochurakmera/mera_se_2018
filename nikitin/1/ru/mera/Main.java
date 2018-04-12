package ru.mera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList(Arrays.asList(args));
        Collections.reverse(strings);
        System.out.println(strings);
    }
}
