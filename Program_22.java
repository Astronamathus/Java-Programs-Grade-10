//Program_22
/*Program to initialise 9 numbers into a 2D array and print it in reverse order in a matrix format*/
//13.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_22
{
    public static void main()
    {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i = 2; i >= 0; i--)
        {
            for(int j = 2; j >= 0; j--)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}