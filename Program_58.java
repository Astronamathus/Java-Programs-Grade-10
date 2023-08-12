//Program_58
/*Design a class to input a String and find the frequency of a word present in the String.*/
//15.6.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_58
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String below:");
        String input = sc.nextLine();
        System.out.println("Enter a word in the String below:");
        String word = sc.next();
        int frequency = 0;
        String temp = "";
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) != ' ')
            {
                temp += input.charAt(i);
            }
            else
            {
                if(temp.equalsIgnoreCase(word))
                {
                    frequency++;
                    temp = "";
                }
                else
                {
                    temp = "";
                }
            }
            System.out.println(temp);
        }
        System.out.println("Frequency of "+word+": "+frequency);
    }
}