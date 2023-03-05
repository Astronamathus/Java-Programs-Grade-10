//Program_36
/*Write a program using a menu to add subtract multiply and divide 2 numbers, using methods (With return, without parameters)*/
//25.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_36
{
    public static int add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers below: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        return sum;
    }
    public static int subtract()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers below: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int difference = x - y;
        return difference;
    }
    public static int multiply()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers below: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int product = x * y;
        return product;
    }public static double divide()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers below: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        double quotient = x/(y*1.0);
        return quotient;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your operation below: ");
        System.out.println("1. Add");
        System.out.println("2. Substract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                int sum1 = add();
                System.out.println("The sum of the 2 numbers are: "+sum1);
                break;
            case 2:
                int difference1 = subtract();
                System.out.println("The difference of the 2 numbers are: "+difference1);
                break;
            case 3:
                int product1 = multiply();
                System.out.println("The product of the 2 numbers are: "+product1);
                break;
            case 4:
                double quotient1 = divide();
                System.out.println("The quotient of the 2 numbers are: "+quotient1);
                break;
        }
    }
}
