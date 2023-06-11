//Program_50
/*Design a class to input a String and print the total number of vowels in it.*/
//7.6.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_50
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string below:");
        String input = sc.nextLine();
        String input_low = input.toLowerCase();
        int count = 0;
        System.out.println("The number of vowels in "+input+" are: ");
        for(int i = 0; i<input.length(); i++)
        {
            char c = input_low.charAt(i);
            if(input.charAt(i) == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                count++;    
            }
        }
        System.out.println(count);
    }
}