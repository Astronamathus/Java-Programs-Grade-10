//Program_10
/*Program to initialise an array with the following values:
   x = {6, 2, 3, 4, 1, 7, 8, 5}
   Accept a value from the user and perfrorm a linear search to print the cell position it occupies in the array*/
//6.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_10
{
    public static void main()
    {
        boolean flag = false;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below:");
        int input = sc.nextInt();
        int x[] = {6, 2, 3, 4, 1, 7, 8, 5};
        for(i = 0; i < 8; i++)
        {
            if(x[i] == input)
            {
                flag = true;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println(input+" found at cell "+ (i+1));
        }
        else
        {
            System.out.println(input+" not found in the array");
        }
    }
}