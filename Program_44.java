//Program_44
/*Write a program to overload a function "area()". Accept the values from the user and display the area of a square, rectangle, circle and triangle.*/
//29.5.23
//Suday
//Greenwood High
import java.util.Scanner;
class Program_44
{
    public static void area(int s)
    {
        int area = s*s;
        System.out.println("Area of square is: "+area);
    }
    public static void area(int l, int b)
    {
        int area = l*b;
        System.out.println("Area of rectangle is: "+area);
    }
    public static void area(double r)
    {
        double area = (22/7.0*r*r)/1.0;
        System.out.println("Area of circle is: "+area);
    }
    public static void area(double h, double b)
    {
        double area = 1/2.0*b*h;
        System.out.println("Area of triangle is: "+area);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int s = sc.nextInt();
        area(s);
        System.out.println("Enter the sides of the rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        area(l, b);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextInt();
        area(r);
        System.out.println("Enter the base and height of the triangle: ");
        double base = sc.nextDouble();
        double h = sc.nextDouble();
        area(base, h);
    }
}