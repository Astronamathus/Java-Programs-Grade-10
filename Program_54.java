//Program_54
/*Design a class to input a String and reaplce every 'e' with a '*'.*/
//8.6.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_54
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string below:");
        String input = sc.nextLine();
        System.out.println(input+" with 'e' replaced with '*' is: ");
        for(int i = 0; i<input.length(); i++)
        {
            char c = input.charAt(i);
            if(c == 'e')
            {    
                System.out.print('*');
            }
            else
            {
                System.out.print(c);
            }
        }
    }
}