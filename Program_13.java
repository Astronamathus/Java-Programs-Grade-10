//Program_13
/*Program to initialise a sorted array of 10 strings. Accept a string value from the user and using binary search print the cell position it occupies in the array.*/
//6.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_13
{
    public static void main()
    {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name below:");
        String input = sc.next();
        int low = 0, high = 9, mid = 0;
        String a[] = {"Arya", "Bill", "Caroline", "Dhruv", "Ekagra", "Farhan", "Gautam", "Henry", "Isaac", "Jeff"};
        while (low<=high)
        {
            mid = (low+high)/2;
            if(input.compareTo(a[mid]) > 0)
            {
                low = mid+1;
            }
            else if(input.compareTo(a[mid]) < 0)
            {
                high = mid-1;
            }
            else if(input.equals(a[mid]))
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
