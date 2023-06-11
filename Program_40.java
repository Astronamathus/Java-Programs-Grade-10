//Program_40
/*Write a program using a menu to add subtract multiply and divide 2 numbers, using methods (With return, with parameters)*/
//27.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_40
{
    public static double add(double a , double b)
    {
        double sum = a + b; 
        return sum;
    }
    public static double subtract(double a , double b)
    {
        double difference = a - b; 
        return difference;
    }
    public static double multiply(double a , double b)
    {
        double product = a * b; 
        return product;
    }
    public static double divide(double a , double b)
    {
        double quotient = a/b; 
        return quotient;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your operation below: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Mulitply");
        System.out.println("4. Divide");
        int choice = sc.nextInt();
        System.out.println("Enter 2 numbers below: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        switch(choice)
        {
            case 1: 
                double sum1 = add(a, b);
                System.out.println("The sum of "+a+" and "+b+" is: "+sum1);
                break;
            case 2:
                double diff1 = subtract(a, b);
                System.out.println("The difference between "+a+" and "+b+" is: "+diff1);
                break;
            case 3:
                double prod1 = multiply(a, b);
                System.out.println("The product of "+a+" and "+b+" is: "+prod1);
                break;
            case 4:
                double quot1 = divide(a, b);
                System.out.println("The quotient of "+a+" and "+b+" is: "+quot1);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}