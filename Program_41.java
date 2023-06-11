//Program_41
/*Write a program tthat invokes a function satis() to find whether 4 integers, a, b, c, d 
 * sent tot hte function satisfy the equation [a^3 + b^3 + c^3 = d^3] or not. 
 * The function returns 0 if the equation is satified otherwise it returns -1*/
//13.3.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_41
{
    public static int satis(int a, int b, int c, int d)
    {
        int res;
        if((a*a*a) + b*b*b  + c*c*c == d*d*d)
        {
            res = 0;
        }
        else
        {
            res = -1;
        }
        return res;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers below: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int res = satis(a, b, c, d);
        System.out.println("The result is "+res);
    }
}