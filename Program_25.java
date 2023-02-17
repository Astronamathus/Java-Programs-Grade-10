//Program_25
/*Program to enter numbers into a 2D array with 'n' rows and 'm' columns and print the sum of each row*/
//13.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_25
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, sum;
        System.out.println("Enter the number of rows below:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns below:");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter "+(n*m)+" numbers below:");
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < m; j++)
            {
                 a[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < n; i++)
        {
            sum = 0;
            for(j = 0; j < m; j++)
            {
                sum +=a[i][j];
            }
            System.out.println("The sum of row "+(i+1)+" is: "+sum);
        }
    }
}