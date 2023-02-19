//Program_20
/*Program to enter 10 countries and their capitals into 2 single-dimensinal arrays. Enter the value of a country and print its corresponding capital*/
//13.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_20
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String countries[] = new String[10];
        String capitals[] = new String[10];
        int i;
        boolean flag = false;
        System.out.println("Enter 10 countries and their capitals below:");
        for(i = 0; i < 10; i++)
        {
            System.out.print("Country: ");
            countries[i] = sc.next();
            System.out.print("Capital of "+countries[i]+": ");
            capitals[i] = sc.next();
        }
        System.out.println("Enter a country below:");
        String search = sc.next();
        for (i = 0; i < 10; i++)
        {
            if (search.equals(countries[i]))
            {
                flag = true;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println("The capital of "+countries[i]+" is "+capitals[i]);
        }
        else
        {
            System.out.println(search+" was not found in the array");
        }
    }
}
