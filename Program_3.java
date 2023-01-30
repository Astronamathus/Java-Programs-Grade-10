//Program_3
/*Program to enter 10 numbers into an array and print the values of those cells whose subscripts are odd*/
//30.1.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_3
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
        System.out.println("The values of the cells of the array whose subscripts are odd are:");
        for(int i=0; i<10; i++)
        {
            if(i%2==0)
            {
                System.out.println("Element "+(i+1)+" of the array is "+a[i]); //Guess who just avoided concatenation
            }
        }
    }
}