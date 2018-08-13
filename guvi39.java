import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner input = new Scanner(System.in);

        int total=0;

        int numbers;
        int high;

        int counter=0;

        {

        while (counter < 10){

            numbers = input.nextInt();

            total = total + numbers;

            counter++;

             

        }

        high = total;

        System.out.println("The hightest number entered is "+ high);

        }

    }
}
