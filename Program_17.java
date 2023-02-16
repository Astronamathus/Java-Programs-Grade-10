//Program_17
/*Program to enter 5 names into an array and print it in alphabetical order using selection sort*/
//9.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_17
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String a[] = new String[5];
        System.out.println("Enter 5 names below:");
        for(int i = 0; i < 5; i++)
        {
            a[i] = sc.next();
        }
        String small;
        for(int i = 0; i < (a.length-1); i++)
        {
            small = a[i];
            int index = i;
            for(int j = i+1; j<a.length; j++)
            {
                if(a[j].compareTo(small) < 0)
                {
                    small = a[j];
                    index = j;
                }
            }
            String temp;
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}