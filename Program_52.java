//Program_52
/*Design a class to input a String and print the words in different lines.*/
//5.6.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_52
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string below:");
        String input = sc.nextLine();
        System.out.println("The words of "+input+" are: ");
        for(int i = 0; i<input.length(); i++)
        {
            if(input.charAt(i) == ' ')
            {
                System.out.println();
            }
            else
            {
                System.out.print(input.charAt(i));
            }
        }
    }
}