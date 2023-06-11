//Program_48
/*Design a class to input a String and print the number of words in it.*/
//3.6.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_48
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string below:");
        String input = sc.nextLine();
        String trimmed = input.trim();
        int count = 1;
        System.out.println("The number of words in "+input+" are: ");
        for(int i = 0; i<trimmed.length(); i++)
        {
            if(trimmed.charAt(i) == ' ')
            {
                count++;    
            }
        }
        System.out.println("The number of words are: "+count);
    }
}