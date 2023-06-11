//Program_46
/*Write a program to overload a function "hline()"

void hline() without an argument draws a horizontal line 30 characters long using the character "-" to draw the line.

void hline(int n) with one integer argument draws a horizontal line 'n' characters long using the character "*" to draw the line.

void hline(int n, char c) with one integer argument and one character type argument draws a horizontal line 'n' characters long using the character stored in 'c' to draw the line.*/
//29.5.23
//Suday
//Greenwood High
import java.util.Scanner;
class Program_46
{
    public static void hline()
    {
        for(int i = 0; i < 30; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void hline(int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void hline(int n, char c)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice below: ");
        System.out.println("1. Horizontal line");
        System.out.println("2. Horizontal line with 'n' characters");
        System.out.println("3. Horizontal line with 'n' characters and using 'c' character");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                hline();
                break;
            case 2: 
                System.out.println("Enter a number below:");
                int n = sc.nextInt();
                hline(n);
                break;
            case 3:
                System.out.println("Enter a number and character below:");
                int m = sc.nextInt();
                char c = sc.next().charAt(0);
                hline(m, c);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}