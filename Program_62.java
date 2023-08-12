//Program_62
/*Design a class to input a String in uppercase and print it in lowercase except the first letter of each word*/
//19.6.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_62
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String below:");
        String input = sc.nextLine();
        System.out.println("The String in lowercase except the first letter is:");
        System.out.print(Character.toUpperCase(input.charAt(0)));
        for(int i = 1; i < input.length(); i++)
        {
            if(input.charAt(i) == ' ')
            {
                System.out.print(input.charAt(i));
                System.out.print(Character.toUpperCase(input.charAt(i+1)));
                i++;
            }
            else
                System.out.print(Character.toLowerCase(input.charAt(i)));
        }
    }
}
