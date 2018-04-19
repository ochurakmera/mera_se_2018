package rybkin.task1;

public class Main {

    public static void main(String[] args) {
        for (int i = 0;i < args.length;i++) {
            int j = args.length-1-i;
            System.out.print(args[j]+" ");
        }
    }
}
