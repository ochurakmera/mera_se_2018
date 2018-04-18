/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task2;

/**
 *
 * @author VBoreikin
 */
public class OneNumberOperations 
{
    public static boolean isEven(int a_number) 
    {
        return (a_number % 2) == 0;
    }

    public static void main(String[] args) 
    {
        Integer l_number;
        long sum = 0;

        if (args.length != 1) 
        {
            System.out.println("Provide a number");
            return;
        }

        try 
        {
            l_number = Integer.decode(args[0]);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Error in number conversion: " + e);
            return;
        }

        for (int counter = 0; counter <= l_number; ++counter) 
        {
            if (isEven(counter)) 
            {
                sum += counter;
            } 
            else 
            {
                if (counter == 1) 
                {
                    System.out.print("Odd numbers:");
                }
                
                System.out.print(" " + counter);
                
                if(counter >= l_number - 1)
                {
                    System.out.println();
                }
            }
        }
        
        System.out.println("Sum of even numbers: " + sum);
    }
}
