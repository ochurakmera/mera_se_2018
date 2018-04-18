

public class lesson2TwoValue {
    public static void main (String[] args) {
        Long value1 = 455L;
        Long value2 = 66L;

        if( value1 % 2 == 0) {
            System.out.println("Sum is: "+ (value1 + value2));
        }
        if ( value2 % 2 == 0) {
            System.out.println("Different is: " + (value1 - value2));
        }
        if (value1 > 0) {
            System.out.println("Multi is: " + (value1 * value2));
        }
        if (value2 > 0) {
            System.out.println( "Dev is: " + (value1 / value2));
        }

    }
}
