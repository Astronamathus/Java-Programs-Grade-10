//Program_26
/*Program to enter numbers into a 2D array with 'n' rows and 'm' columns and print the sum of each column into and array. Print the array*/
//13.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_26
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, r = 0;
        System.out.println("Enter the number of rows below:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns below:");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int sum[] = new int[m];
        System.out.println("Enter "+(n*m)+" numbers below:");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < m; j++)
            {
                 a[i][j] = sc.nextInt();
            }
        }
        for(i = 0, j = 0; i < n; i++)
        {
            for(r = 0; r < n; r++)
            {
                sum[r] += a[i][r];
            }
        }
        System.out.print("The sum of the columns of the array are: ");
        for(i = 0; i < m; i++)
        {
            System.out.print(sum[i]+ " ");
        }
    }
}