//Program_65
/*Write a program to declare a class Student with integer data type for roll number, string 
 * for name and standard and char for section. The class must have the functions for input()
 * to accept the data from the user, print the main function to create 3 objects and to 
 * display their details in a formatted manner.*/
//23.7.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Student2
{
    int roll_no;
    String name, standard;
    char section;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number of the student: ");
        roll_no = sc.nextInt();
        System.out.println("Enter the name of the student: ");
        name = sc.next();
        System.out.println("Enter the standard of the student: ");
        standard = sc.next();
        System.out.println("Enter the section of the student: ");
        section = sc.next().charAt(0);
    }
    void print()
    {
        System.out.println("\t"+roll_no+" \t "+name+" \t "+standard+" \t "+section+" \t");
    }
    public static void main()
    {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        Student2 s3 = new Student2();
        s1.input();
        s2.input();
        s3.input();
        System.out.println("Roll number \t Name \t Standard \t Section \t");
        s1.print();
        s2.print();
        s3.print();
    }
}
