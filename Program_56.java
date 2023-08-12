//Program_56
/*Design a class to input a word and print wether it is a palindroime*/
//12.6.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_56
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name below:");
        String input = sc.next();
        String rev = "";
        for(int i = input.length() - 1; i >= 0; i--)
        {
            rev += input.charAt(i);
        }
        if(rev.equals(input))
        {
            System.out.println(rev+" is a palindrome");
        }
        else
        {
            System.out.println(rev+" is not a palindrome");
        }
    }
}