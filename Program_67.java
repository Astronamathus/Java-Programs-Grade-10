//Program_67
/*Sponge Iron Company announces an increment for their employees based on security basis as per the given conditions:
  
  +-----------------------------------+---------------------+
  |                Age                |      Increment      |
  +===================================+=====================+
  |         50 years and above        | 20% of basic salary |
  +-----------------------------------+---------------------+
  | Above 45 years and below 50 years | 15% of basic salary |
  +-----------------------------------+---------------------+
  |           Up to 45 years          | 10% of basic salary |
  +-----------------------------------+---------------------+
  
  Write a program to find the new basic by using the following class specifications:
  
  Class: Increment
  
  Data Members / Instance Variables:
  
  String name - Name of the employee
  double basic - Basic pay of the employee
  int age - Age of the employee
  
  Member Methods:
  
  void getdata(String n, double b, int a) - To accept the name, basic and age
  void calculate() - To find the increment and update the basic
  void display() - To display the name, age and updated basic in the format given below 
  
  +-------+-----+---------------+
  |  Name | Age | Updated Basic |
  +-------+-----+---------------+
  | abcde |  xx |     00000     |
  +-------+-----+---------------+ */
//27.7.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Increment
{
    String name;
    int age;
    double basic;
    void getdata(String n, int a, double b)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your basic salary: ");
        basic = sc.nextDouble();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
    }
    void calculate()
    {
        if(age >= 50)
        {
            basic += basic*20/100;
        }
        if(age < 50 && age > 45)
        {
            basic += basic*15/100;
        }
        if(age <= 45)
        {
            basic += basic *10/100;
        }
    }
    void display()
    {
        System.out.println("Name \t Age \t Updated Basic");
        System.out.println(name+"\t"+age+"\t"+basic);
    }
    public static void main()
    {
        String n = "";
        int a = 0;
        double b = 0.0;
        Increment i = new Increment();
        i.getdata(n, a, b);
        i.calculate();
        i.display();
    }
}
