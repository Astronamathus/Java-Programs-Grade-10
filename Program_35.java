//Program_34
/*Write a menu-driven program to print the are of a rectangle, triangle or circle depending upon user's choice*/
//4.8.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_35
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        int radius;
        double pi = 3.14;
        int length;
        int breadth;
        int base;
        int height;
        double result;
        double area = 0.0;
        System.out.println("Enter your choice:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter length below");
                length = sc.nextInt();
                System.out.println("Enter breadth below");
                breadth = sc.nextInt();
                area = length*breadth;
                break;
            case 2:
                System.out.println("Enter base of triangle below");
                base = sc.nextInt();
                System.out.println("Enter height of triangle below");
                height = sc.nextInt();
                area = 1.0/2*base*height;
                break;
            case 3:
                System.out.println("Enter radius below");
                radius = sc.nextInt();
                area = pi*radius*radius;
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("The result is "+area);
    }
}