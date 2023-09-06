//Program_75
/*Define a  class 'Student' with the following specifications:

Data Members / Instance Variables: int no1, no2, no3;
                                   int sum;
Member Methods:

i) Student(int num1, int num2, int num3, int sum) - A parameterised constructor to initialise the data members
ii) Student() - Default constructor to initialise the data members
iii) accept() - To accept the numbers
iv)  compute() - To compute the sum of 3 numbers
v)  display() - To display the sum of 3 numbers

Write a main method to create 2 objects and all the other member methods (Each object for invoking default and parameterised constructor). */
//1.9.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Student4
{
    int no1, no2, no3, sum;
    Student4(int n_1, int n_2, int n_3, int s_1)
    {
        no1 = n_1;
        no2 = n_2;
        no3 = n_3;
        sum = s_1;
    }
    Student4()
    {
        no1 = 0;
        no2 = 0;
        no3 = 0;
        sum = 0;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number below: ");
        no1 = sc.nextInt();
        System.out.println("Enter the second number below: ");
        no2 = sc.nextInt();
        System.out.println("Enter the third number below: ");
        no3 = sc.nextInt();
    }
    void compute()
    {
        sum = no1 + no2 + no3;
    }
    void display()
    {
        System.out.println("Sum of the three numbers: "+sum);
    }
    public static void main()
    {
        Student4 std = new Student4();
        std.accept();
        std.compute();
        std.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n_1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n_2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int n_3 = sc.nextInt();
        Student4 std2 = new Student4(n_1, n_2, n_3, 0);
        std2.compute();
        std2.display();
    }
}
