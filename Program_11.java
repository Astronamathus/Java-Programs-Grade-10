//Program_11
/*Program to write a program to enter 10 names of students in an array and ask user to input a name and laocate in using linear search*/
//6.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_11
{
    public static void main()
    {
        boolean flag = false;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 names of students below:");
        String Names[] = new String [10];
        for(i = 0; i < 10; i++)
        {
            Names[i] = sc.next();
        }
        System.out.println("Enter a name below:");
        String input = sc.next();
        for(i = 0; i < 10; i++)
        {
            if(input.equals(Names[i]))
            {
                flag = true;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println(input+" is student no. "+ (i+1));
        }
        else
        {
            System.out.println(input+" not found in the array");
        }
    }
}