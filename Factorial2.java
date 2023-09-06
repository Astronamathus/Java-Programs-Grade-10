//Program_74
/*Write a class with the following class specifications:

Class Name: Factorial

Data Members / Instance Variables: int a

Member Functions:

Factorial() - Default constructor to initialize the data member
Factorial(int b) - Parameterized constructor to initialize the data member
void input(int m) - To assign a with m
void display() - To print the factorial of the number

Create two objects (To invoke the default constructor and the parameterized constructor)*/
//21.8.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Factorial2
{
    int a;
    Factorial2()
    {
        a = 0;
    }
    Factorial2(int b)
    {
        a = b;
    }
    void input(int m)
    {
        a = m;
    }
    void display()
    {
        System.out.println("The factorial of the number is: " +a);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number below: ");
        int n = sc.nextInt();
        int m = 1;
        for(int i = 1; i <= n; i++)
        {
            m *= i;
        }
        Factorial2 fact = new Factorial2();
        Factorial2 fact2 = new Factorial2(0);
        fact.input(m);
        fact.display();
    }
}
