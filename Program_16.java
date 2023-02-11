//Program_16
/*Program to enter 5 vowels into an array and print it in ascending order using selection sort*/
//9.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_16
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, index; 
        System.out.println("Enter 5 vowels below: ");
        char a[] = new char[5];
        for(i = 0; i < 5; i++)
        {
            a[i] = sc.next().charAt(0);
            if(a[i] == 'a' || a[i] == 'A' || a[i] == 'e' || a[i] == 'E' || a[i] == 'i' || a[i] == 'I' || a[i] == 'o' || a[i] == 'O' || a[i] == 'u' || a[i] == 'U')
            {
                continue;
            }
            else
            {
                System.out.println("Invalid input, try again");
                i--;
            }
        }
        char small;
        for(i = 0; i < (a.length-1); i++)
        {
            small = a[i];
            index = i;
            for(j = i+1; j<a.length; j++)
            {
                if(a[j] < small)
                {
                    small = a[j];
                    index = j;
                }
            }
            char temp;
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        for(i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}