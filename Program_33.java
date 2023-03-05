//Program_33
/*Program to enter marks obtained b
 * y 10 students in 3 subjects and calculate the grades for each student based on the average marks*/
//20.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_33{
    public static void main()
    {
        Scanner sc = new Scanner(System.in); 
        String grade = " ";
        int marks[][] = new int[10][3]; 
        double average[] = new double[10];
        System.out.println("Enter marks scored by students in 3 tests: ");
        for(int w = 0; w < 10; w++){
            System.out.print("Marks obtained by student "+(w+1));
            for(int j = 0; j < 3; j++){    
                System.out.print(" in test "+(j+1)+": ");
                marks[w][j] = sc.nextInt();
            }
        }
        for(int w = 0; w < 10; w++){
            int sum = 0;
            for(int j = 0; j < 3; j++)
            {
                    sum += marks[w][j]; 
            }
            average[w] = sum/3.0;
            System.out.println(average[w]);
        }
        for(int w = 0; w < 10; w++)
        {
            grade = " ";
            if(average[w] <= 45.0)
            {
                grade = "D";
            }
            else if(average[w] > 45.0 && average[w] <=60.0)
            {
                grade = "C";
            }
            else if(average[w] > 60.0 && average[w] <=75.0)
            {
                grade = "B";
            }
            else if(average[w] > 75.0)
            {
                grade = "A";
            }
            System.out.println("Student "+(w+1)+" got a grade of: "+grade);
            }
        }
    }