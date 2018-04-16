package boreykin.lesson1;

public class ReverseArgsOrder
{
    public static void main(String [] args)
    {
        System.out.print("Arguments in reverse order: ");
        
        for(int index = args.length - 1; index >= 0; --index)
        {
            System.out.print(" " + args[index]);
        }
        
        System.out.println();
    }
}
