//Program_5
/*Program to accept 20 numbers in an array amd print only the even values*/
//30.1.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_05
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        System.out.println("Enter 20 elements for an array below");
        for(int i=0; i<20; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The even values of the array are:");
        for(int i=0; i<20; i++)
        {
            if(a[i]%2==0)
                System.out.print(a[i]+" ");
        }
    }
}