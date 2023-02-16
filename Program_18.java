//Program_18
/*Program to enter marks of 7 students into an array and print it in ascending order using bubble sort*/
//13.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_18
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[7];
        System.out.println("Enter marks of 7 stusdents below:");
        for(int i = 0; i < 7; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < (a.length-1); i++)
        {
            for(int j = 0; j < ((a.length - i) -1); j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp;
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