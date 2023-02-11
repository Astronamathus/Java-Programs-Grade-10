//Program_6
/*Program to accept values into 2 different arrays of 10 numbers each. Store the sum of the 2 arrays in a separate array and print it*/
//30.1.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_06
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter 10 elements for an array below");
        for(int i=0; i<10; i++)
        {
            a[i] = sc.nextInt();
        }
        int b[] = new int[10];
        System.out.println("Enter 10 elements for another array below");
        for(int i=0; i<10; i++)
        {
            b[i] = sc.nextInt();
        }
        System.out.println("The sum values of both the arrays are:");
        int c[] = new int[10];
        for(int i=0; i<10; i++)
        {
            c[i] = a[i] + b[i];
            System.out.print(c[i]+" ");
        }
    }
}