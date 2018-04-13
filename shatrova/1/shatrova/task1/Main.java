package shatrova.task1;

public class Main {
    public static void main (String [] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[args.length-i-1] + " ");
        }
    }
}
