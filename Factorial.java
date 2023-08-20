//Program_69
/*Write a progam with the following specifications:

Class name: Factorial

Data Members: int a

Member funtions:
   
   Factorial() default construct to initialise the data members
   void input(int m) to assign a with m
   void display() to print factorial of the number*/
//3.8.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Factorial
{
    int a;
    Factorial()
    {
        a = 0;
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
        Factorial fact = new Factorial();
        fact.input(m);
        fact.display();
    }
}
