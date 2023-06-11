//Program_47
/*Design a class to input a String and print the letters in different lines.*/
//3.6.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_47
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string below:");
        String input = sc.next();
        System.out.println("The letters of "+input+" are: ");
        for(int i = 0; i<input.length(); i++)
        {
            System.out.println(input.charAt(i));
        }
    }
}