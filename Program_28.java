//Program_28
/*Program to enter numbers into a 2D array and print the upper left half*/
//16.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_28
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter the number of rows and columns below:");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter "+(n*n)+" numbers below:");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                 a[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                if(j <= i)
                {
                    System.out.print(a[i][j]+ " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}