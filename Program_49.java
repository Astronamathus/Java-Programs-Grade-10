//Program_49
/*Design a class to input a String and print the number of spaces in it.*/
//3.6.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_49
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string below:");
        String input = sc.nextLine();
        int count = 0;
        System.out.println("The number of spaces in "+input+" are: ");
        for(int i = 0; i<input.length(); i++)
        {
            if(input.charAt(i) == ' ')
            {
                count++;    
            }
        }
        System.out.println(count);
    }
}