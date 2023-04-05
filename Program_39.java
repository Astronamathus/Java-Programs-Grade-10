//Program_39
/*Write a program to pass 2 integer values to a function such that the first value is lower than the second value. The function should return the sum of all the numbers in the range of the 2 numbers*/
//27.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_39
{
    public static int range_add(int a, int b)
    {
        int sum = 0;
        for(int i = a; i <= b; i++)
        {
             sum += i;
        }
        return sum;
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers below: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum_1;
        if(a < b)
        {
            sum_1 = range_add(a, b);
        }
        else 
        {
            sum_1 = range_add(b, a);
        }
        System.out.println("The sum of number between "+a+" and "+b+" is: "+sum_1);
    }
}