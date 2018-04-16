package terletskiy.task1;

public class ReversedPrint {
    public static void main(String[] args) {
        RecursiveReversedPrint.print(args);
    }

    /**Just for fun*/
    public static class RecursiveReversedPrint {
        private static int len = 0;
        public static void print(String[] args){
            int index = len;
            if (++len > args.length)
            {
                len = 0;
                return;
            }
            print(args);
            System.out.print(args[index] + ' ');
        }
    }
}
