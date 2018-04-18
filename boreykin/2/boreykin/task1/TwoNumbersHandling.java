/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;
        
/**
 *
 * @author VBoreikin
 */
public class TwoNumbersHandling 
{
    public static boolean isEven(Long a_number)
    {
        return (a_number % 2) == 0;
    }
        
    public static void main(String [] args)
    {
        Long firstNumber;
        Long secondNumber;
        
        if(args.length != 2)
        {
            System.out.println("Two numbers should be provided");
            return;
        }
        
        try
        {
            firstNumber = Long.decode(args[0]);
            secondNumber = Long.decode(args[1]);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error in number conversion: " + e);
            return;
        }
        
        if(isEven(firstNumber))
        {
            System.out.println("Sum : " + (firstNumber + secondNumber));
        }
        
        if(isEven(secondNumber))
        {
            System.out.println("Diff: " + (firstNumber - secondNumber));
        }
        
        if(firstNumber > 0)
        {
            System.out.println("Mult: " + (firstNumber * secondNumber));
        }
        
        if(secondNumber > 0)
        {
            System.out.println("Div : " + (firstNumber / secondNumber));
        }
    } 
}
