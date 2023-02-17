//Program_29
/*Program to enter 9 names into a 2D array and print the left diagonal elements of the matrix*/
//16.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_29
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, j;
        String a[][] = new String[3][3];
        System.out.println("Enter "+9+" names below:");
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                 a[i][j] = sc.next();
            }
        }
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                if(j == i)
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