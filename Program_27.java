//Program_27
/*Program to enter numbers into a 2D array and print the sum of diagonal elements*/
//16.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_27
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, sum_left = 0, sum_right = 0;
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
                if(i == j)
                {
                    sum_left += a[i][j];
                }
            }
        }
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                if((i+j) == (n - 1))
                {
                    sum_right += a[i][j];
                }
            }
        }
        System.out.println("The sum of left diagonal elements is: "+sum_left);
        System.out.println("The sum of right diagonal elements is: "+sum_right);
    }
}