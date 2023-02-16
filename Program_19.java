//Program_19
/*Program to enter 10 characters in a character array and sort it in ascending order using bubble sort*/
//13.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_19
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char a[] = new char[10];
        System.out.println("Enter 10 characters below:");
        for(int i = 0; i < 10; i++)
        {
            a[i] = sc.next().charAt(0);
        }
        for(int i = 0; i < (a.length-1); i++)
        {
            int index = i;
            for(int j = 0; j < ((a.length - i) -1); j++)
            {
                if(a[j] > a[j+1])
                {
                    char temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}