package ru.mera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //1
        for(int i = args.length; i>=0; i--) {
            System.out.print(args[i] + (i>0 ? ", " : '\n'));
        }
        //2
        ArrayList<String> strings = new ArrayList(Arrays.asList(args));
        Collections.reverse(strings);
        System.out.println(strings);
    }
}
