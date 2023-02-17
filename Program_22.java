//Program_22
/*Program to initialise 9 numbers into a 2D array and print it in reverse order in a matrix format*/
//13.2.23
//Suday Dutta
//Greenwood High
class Program_22
{
    public static void main()
    {
        char a[][] = {{'a', 'b', 'c'}, {'e', 'f', 'g'}, {'h', 'i', 'j'}};
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
