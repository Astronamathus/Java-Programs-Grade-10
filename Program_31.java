//Program_31
/*Program to enter 10 names of students into an array and in another array enter the marks obtained by 10 students in 2 tests (using 2-D) calculate the total marks obtained by each student and print the name of the student and print it along with the total marks obtained by the student*/
//20.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_31
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in); 
        String names[] = new String[10];
        int marks[][] = new int[2][10]; 
        int total[] = new int[10];
        System.out.println("Enter name of 10 students below: ");
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Name of student "+(i+1)+": ");
            names[i] = sc.next();
        }
        System.out.println("Enter marks scored by students in 2 tests: ");
        for(int w = 0, n = 0; w < 10; w++, n++)
        {
            for(int j = 0; j < 2; j++)
            {    
                System.out.println("Marks obtained by "+names[n]+" in test "+(j+1)+": ");
                marks[j][w] = sc.nextInt();
            }
        }
        for(int w = 0, n = 0; w < 10; w++)
        {
                for(int j = 0; j < 2; j++, n++)
                {
                    total[w] += marks[j][w]; 
                }
        }
        for(int w = 0, n = 0; w < 10; w++, n++)
        {
            System.out.println(names[n]+" scored a total of"+total[w]);
        }
    }
}