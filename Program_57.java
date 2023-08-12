//Program_57
/*Design a class to inout a String
 * and print the number of uppercase and lower case letter, digits, and special characters.*/
//12.6.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_57
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name below:");
        String input = sc.next();
        int count_up = 0, count_low = 0, count_digits = 0, count_sc = 0;
        for(int i = 0; i < input.length(); i++)
        {
            if(Character.isLowerCase(input.charAt(i)))
                count_low++;
            else if(Character.isUpperCase(input.charAt(i)))
                count_up++;
            else if(Character.isDigit(input.charAt(i)))
                count_digits++;
            else
                count_sc++;
        }
        System.out.println("Number of lowercase letters: "+count_low);
        System.out.println("Number of uppercase letters: "+count_up);
        System.out.println("Number of digits letters: "+count_digits);
        System.out.println("Number of special characters: "+count_sc);
    }
}