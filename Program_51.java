//Program_51
/*Design a class to input a String and print the total number of individual vowels in it.*/
//5.6.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_51
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string below:");
        String input = sc.nextLine();
        String input_low = input.toLowerCase();
        int a_count = 0;
        int e_count = 0;
        int i_count = 0;
        int o_count = 0;
        int u_count = 0;
        System.out.println("The number of vowels in "+input+" are: ");
        for(int i = 0; i<input.length(); i++)
        {
            char c = input_low.charAt(i);
            if(c == 'a')
            {
                a_count++;    
            }
            if(c == 'e')
            {
                e_count++;    
            }
            if(c == 'i')
            {
                i_count++;    
            }
            if(c == 'o')
            {
                o_count++;    
            }
            if(c == 'u')
            {
                u_count++;    
            }
        }
        System.out.println("The following are the number of vowels:");
        System.out.println("The number of A's: "+a_count);
        System.out.println("The number of E's: "+e_count);
        System.out.println("The number of I's: "+i_count);
        System.out.println("The number of O's: "+o_count);
        System.out.println("The number of U's: "+u_count);
    }
}