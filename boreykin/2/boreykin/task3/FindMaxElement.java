/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task3;

/**
 *
 * @author VBoreikin
 */
public class FindMaxElement 
{
    public static void main(String [] args)
    {
        int array [] = {3, 2, -1, -5, 110, 120, -13, 4, 5, 6};
        int maxElement = array[0];
        int maxElementIndex = 0;
        
        for(int index = 0; index < array.length; ++index)
        {
            if(array[index] > maxElement)
            {
                maxElement = array[index];
                maxElementIndex = index;
            }
            
            if(array[index] > 100)
            {
                break;
            }            
        }
        
        System.out.println("Max element index is: " + maxElementIndex);
    }
}
