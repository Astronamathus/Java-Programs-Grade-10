//Program_9
/*Program to store the lists of roll numbers and marks of a class of 35 students. Print the maximum marks and the roll number of the student*/
//6.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_09
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int roll_no = 0;
        int roll[] = new int[35];//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27 ,28, 29, 30, 31, 32, 33, 34, 35};
        int marks[] = new int[35];//{70, 57, 68, 73, 56, 57, 69, 94, 53, 62, 72, 58, 64, 52, 81, 87, 63, 98, 92, 48, 100, 60, 70, 80, 83, 75, 77, 66, 76, 79, 86, 63, 61, 90, 97};
        System.out.println("Enter the roll no. and marks of 35 students respectively below:");
        for(int i = 0; i<35; i++)
        {
            roll[i] = sc.nextInt();
            marks[i] = sc.nextInt();
        }
        int max = marks[1];
        for(int i = 0; i<35; i++)
        {
            if(marks[i] > max)
            {
                max = marks[i];
                roll_no = roll[i];
            }
        }
        System.out.println("The highest marks is "+ max + " scored by student no. "+roll_no);
    }
}