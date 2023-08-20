//Program_63
/*Write a program to declare a class Student with integer datatype for roll number, string for name 
 * and standard and char for section. The class must have the functions for input() with parameters,
 * print the main function to accept details and pass it to the input function and to create an
 * object and to display its details in a formatted manner.*/
//26.6.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Student
{
    int roll_no;
    String name, standard;
    char section;
    void input(int roll, String n, String std, char sec)
    {
        roll_no  = roll;
        name = n;
        standard = std;
        section = sec;
    }
    void print()
    {
        System.out.println("Roll number \t Name \t Standard \t Section \t");
        System.out.print("   "+roll_no+"\t \t "+name+" \t "+standard+"\t \t"+section);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number of the student: ");
        int roll = sc.nextInt();
        System.out.println("Enter the name of the student: ");
        String n = sc.next();
        System.out.println("Enter the standard of the student: ");
        String std = sc.next();
        System.out.println("Enter the section of the student: ");
        char sec = sc.next().charAt(0);
        Student s1 = new Student();
        s1.input(roll, n, std, sec);
        s1.print();
    }
}
