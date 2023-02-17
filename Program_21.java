//Program_21
/*Program to initialise 9 numbers into a 2D array and print it in a matrix*/
//13.2.23
//Suday Dutta
//Greenwood High
class Program_21
{
    public static void main()
    {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
