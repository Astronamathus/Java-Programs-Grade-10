//Program_23
/*Program to enter 9 numbers into a 2D array and print it in a matrix, displaying only the even numbers in the array*/
//13.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_23
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int i, j;
        System.out.println("Enter nine numbers below:");
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                 a[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                if(a[i][j] %2 == 0)
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