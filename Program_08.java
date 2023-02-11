//Program_8
/*Program to enter names and marks of 10 students into an array and print it in a formatted manner*/
//6.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_08
{
    public static void main()
    {
        int marks[] = new int[10];
        String names[] = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and marks of 10 students respectively below:");
        for(int i = 0; i<10; i++)
        {
            System.out.print("Name: ");
            names[i] = sc.next();
            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
        }
        System.out.println("The following table shows the marks of the 10 students:");
        System.out.println("Name" +"\t"+ "Marks");
        for(int i = 0; i<10; i++)
        {
            System.out.println(names[i] +"\t"+ marks[i]);
        }
    }
}