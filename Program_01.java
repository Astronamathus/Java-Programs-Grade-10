//Program_1
/*Program to enter 10 numbers into an array and print it*/
//30.1.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_01
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
        System.out.println("The 10 elements for an array you enterd are:");
        for(int i=0; i<10; i++)
        {
            System.out.println("Element "+(i+1)+" of the array is "+a[i]); //Guess who just avoided concatenation
        }
    }
}