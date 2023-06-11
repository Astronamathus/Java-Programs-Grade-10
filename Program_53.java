//Program_53
/*Design a class to input a String and change the case of each character of the String and display it.*/
//8.6.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_53
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string below:");
        String input = sc.nextLine();
        System.out.println(input+" with the cases changed is: ");
        for(int i = 0; i<input.length(); i++)
        {
            char c = input.charAt(i);
            if(Character.isLowerCase(c))
                System.out.print(Character.toUpperCase(c));
            else if(Character.isUpperCase(c))
                System.out.print(Character.toLowerCase(c));
            else
                System.out.print(c);
        }
    }
}