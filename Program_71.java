//Program_71
/*Define a class "Temperature" described as below: 

Data Members / Instance Variables:

double max, double min, double f1, double f2

Member Methods: 

a) A parameterized constructor to initialize the data members
b) To accept() the maximum (max) and minimum (min) temperatures of a day in Celsius
c) To compute() the maximum and minimum temperatures in Fahrenheit (F = 9C/5 + 32)
d) To display() the maximum and minimum temperatures in Fahrenheit

Write a main method to create an object of a class and call the above methods*/
//10.8.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Temperature
{
    double max, min, f1, f2;
    Temperature()
    {
        max = 0.0;
        min = 0.0;
        f1 = 0.0;
        f2 = 0.0;   
    }
    Temperature(double m, double m1, double f_1, double f_2)
    {
        max = m;
        min = m1;
        f1 = f_1;
        f2 = f_2;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the highest temperature below (in Celsius):");
        max = sc.nextDouble();
        System.out.println("Enter the lowest temperature below (in Celsius):");
        min = sc.nextDouble();
    }
    void calculate()
    {
        f1 = ((9/5.0) * max) + 32.0;
        f2 = ((9/5.0) * min) + 32.0; 
    }
    void display()
    {
        System.out.println("The highest temperature in Fahrenheit is: " + f1 + "˚F");
        System.out.println("The lowest temperature in Fahrenheit is: " + f2 + "˚F");
    }
    public static void main()
    {
         Temperature t1 = new Temperature();
         Temperature t2 = new Temperature(32.0, 23.0, 0.0, 0.0);
         t2.accept();
         t1.calculate();
         t1.display();
    }
}
