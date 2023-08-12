//Program_55
/*Design a class to input a name and print the intials*/
//12.6.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_55
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name below:");
        String input = sc.nextLine();
        String input_trim = input.trim();
        System.out.print("Your intitals are: ");
        System.out.print(input_trim.charAt(0)+".");
        for(int i = 0; i < input.length(); i++)
        {
            if(input_trim.charAt(i) == ' ')
            {
                System.out.print(Character.toUpperCase(input_trim.charAt(i+1))+".");
            }
        }
    }
}