//Program_2
/*Program to enter 10 numbers into an array and print it in reverse order*/
//30.1.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter 10 elements for an array below");
        for(int i=9; i>=0; i--)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The 10 elements for an array you entered in reverse order are:");
        for(int i=9; i>=0; i--)
        {
            System.out.println("Element "+(i+1)+" of the array is "+a[i]); //Guess who just avoided concatenation
        }
    }
}