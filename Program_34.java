//Program_34
/*Write a menu-driven program to input the radius of a circle and print its area or perimeter depending upon users choice*/
//4.8.22
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_34
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int radius;
        double pi = 3.14;
        double result;
        System.out.println("Enter the radius of a circle:");
        radius = sc.nextInt();
        System.out.println("Choose an option");
        System.out.println("1. Perimeter");
        System.out.println("2. Area");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                result = 2*pi*radius;
                System.out.println("The perimeter is "+ result);
                break;
            case 2:
                result = pi*radius*radius;
                System.out.println("The area is "+ result);
                break;
            default:
                System.out.println("The input is invalid");
        }
    }
}