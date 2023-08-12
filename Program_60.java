//Program_60
/*Design a class to input a String and display the total number of consonants in it.*/
//15.6.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_60
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String below:");
        String input = sc.nextLine();
        System.out.print("The number of consonants in the String are: ");
        int count = 0;
        for(int i = 0; i < input.length(); i++)
        {
            char c = Character.toLowerCase(input.charAt(i));
            if(c != 'a' || c != 'e' ||c != 'i' ||c != 'o'||c != 'u')
            {
                count++;
            }    
        }
        System.out.println(count);
    }
}