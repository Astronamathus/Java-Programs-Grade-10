//Program_12
/*Program to initialise an array of 10 numeric integers sorted in ascending order. Accept a value from the user and using binary search print the cell position it occupies in the array.*/
//6.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_12
{
    public static void main()
    {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below:");
        int input = sc.nextInt();
        int low = 0, high = 9, mid = 0;
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        while (low<=high)
        {
            mid = (low+high)/2;
            if(input > a[mid])
            {
                low = mid+1;
            }
            else if(input < a[mid])
            {
                high = mid-1;
            }
            else if(input == a[mid])
            {
                flag = true;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println(input+" found at "+(mid + 1));
        }
        else
        {
            System.out.println(input+" not found in array");
        }
    }
}