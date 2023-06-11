//Program_42
/*Design a class which contains a function volume(). Using function overloading compute the volume of the shapes of cube, cuboid, and sphere.
    Volume of cube = s*s*s (s = length of one side of cube)
    Volume of cuboid = l*b*h
    Volume of sphere = 4/3 * π * r^3 (Take π = 22/7.0)*/
//13.3.23
//Suday
//Greenwood High
import java.util.Scanner;
class Program_42
{
    public static void volume(int s)
    {
        int volume = s*s*s;
        System.out.println("Volume of cube is: "+volume);
    }
    public static void volume(int l, int b, int h)
    {
        int volume = l*b*h;
        System.out.println("Volume of cuboid is: "+volume);
    }
    public static void volume(double r)
    {
        double volume = 4/3.0*22/7.0*r*r*r;
        System.out.println("Volume of sphere is: "+volume);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the cube: ");
        int s = sc.nextInt();
        System.out.println("Enter the sides of the cuboid: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Enter the radius of the sphere: ");
        double r = sc.nextInt();
        System.out.println("The volume of the square is:");
        volume(s);
        System.out.println("The volume of the rectangle is:");
        volume(l, b, h);
        System.out.println("The volume of the sphere is:");
        volume(r);
    }
}