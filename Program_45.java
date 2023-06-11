//Program_45
/*Write a program to print the name, roll number and appropriate values as the marks for primary, middle and high school children. Using overloaded functions, calculate and print the percentage scored by the student.*/
//29.5.23
//Suday
//Greenwood High
import java.util.Scanner;
class Program_45
{
    public static double percent(int a, int b)
    {
        int sum = a + b;
        double avg = sum/200.0;
        double percentage = avg * 100;
        return percentage;
    }
    public static double percent(int a, int b, int c, int d)
    {
        int sum = a + b + c + d;
        double avg = sum/400.0;
        double percentage = avg * 100;
        return percentage;
    }
    public static double percent(int a, int b, int c, int d, int e)
    {
        int sum = a + b + c + d + e;
        double avg = sum/500.0;
        double percentage = avg * 100;
        return percentage;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name below:");
        String name = sc.nextLine();
        System.out.println("Enter your roll number below:");
        int roll_no = sc.nextInt();
        System.out.println("Enter your school level below:");
        System.out.println("1) Primary");
        System.out.println("2) Middle");
        System.out.println("3) High");        
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: 
                System.out.println("Enter the marks you scored in 2 subjects");
                int a = sc.nextInt();
                int b = sc.nextInt();
                double percentage = percent(a, b); 
                System.out.println(name+", roll number "+roll_no+" scored a percentage of: "+percentage+" %");
                break;
            case 2: 
                System.out.println("Enter the marks you scored in 4 subjects");
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();
                int f = sc.nextInt();
                double percentage1 = percent(c, d, e, f);
                System.out.println(name+", roll number "+roll_no+" scored a percentage of: "+percentage1+" %");
                break;
            case 3: 
                System.out.println("Enter the marks you scored in 5 subjects");
                int g = sc.nextInt();
                int h = sc.nextInt();
                int i = sc.nextInt();
                int j = sc.nextInt();
                int k = sc.nextInt();
                double percentage2 = percent(g, h, i, j, k);
                System.out.println(name+", roll number "+roll_no+" scored a percentage of: "+percentage2+" %");
                break;
            default:
                System.out.println("invalid Input");
        }
    }
}