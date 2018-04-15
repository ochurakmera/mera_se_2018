class Program {
    public static void main(String[] args) {
        int i = args.length;
        for (int j=1; j<=args.length; j++) {
            System.out.print(args[i-j]);
            System.out.print(" ");
        }
    }
}
