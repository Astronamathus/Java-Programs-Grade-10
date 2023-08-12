//Program_60
/*Design a class to input a String and print the ASCII value of each character.*/
//15.6.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_61
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String below:");
        String input = sc.nextLine();
        System.out.println("The ASCII values of all the characters in the String are: ");
        for(int i = 0; i < input.length(); i++)
        {
               System.out.println(input.charAt(i) + ": " + (int)input.charAt(i));
        }
    }
}