//Program_73
/*Write a progam with the following specifications:

Class name: Sort

Data Members / Instance Variables: 
	integer array for 10 integers
  	int i, j, temp;

Member funtions:
   void inputdata() to accept 10 integers in the array
   void arrange() to arrange the numbers is ascending order
   void outputdata() to display the array elements in ascending order */
//14.8.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Sort
{
    int arr[] = new int[10];
    int i, j, temp;
    void inputdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements below: ");
        for(i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    void arrange()
    {
        for(i = 0; i < 10 - 1; i++)
        {
            for(j = 0; j < 10 - i - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void outputdata()
    {
        System.out.println("The elements in ascending order are: ");
        for(i = 0; i < 10; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main()
    {
        Sort s = new Sort();
        s.inputdata();
        s.arrange();
        s.outputdata();
    }
}
