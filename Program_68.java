//Program_68
/*Define a class "Telephone" having the following description:

Data Members / Instance Variables:

String name;
int prv, pre - To store the previous and present meter readinds
int call - To store the number of calls made (i.e pre - prv)
double amt - To store the amount
double total - To store the total amount to be paid

Member Methods:

void input() - To store the previous reading, present reading, and the name of the consumer
void cal() - To calculate the amount and the total amount to be paid
void display() - To display the name of the consumer, number of calls made, amount, and the total amount to be paid

Write a program to compute the monthly bill to be paid according to the given conditions and display the output as per the given format:

+------------------------+-------------------+
|       Calls made       |        Rate       |
+------------------------+-------------------+
|     Upto 100 calls     |     No charge     |
+------------------------+-------------------+
| For the next 100 calls | 90 paise per call |
+------------------------+-------------------+
| For the next 200 calls | 80 paise per call |
+------------------------+-------------------+
|   More than 400 calls  | 70 paise per call |
+------------------------+-------------------+

Every consumer has to pay Rs. 180 per month as monthly rent for availing the service

Output:
+------------------+------------+-------------------+
| Name of consumer | Calls made | Amount to be paid |
+------------------+------------+-------------------+
|       abcde      |     xx     |         00        |
+------------------+------------+-------------------+*/
//31.7.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Telephone
{
    String name;
    int prv, pre, call;
    double amt, total;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name below: ");
        name = sc.next();
        System.out.println("Enter the previous month's readngs: ");
        prv = sc.nextInt();
        System.out.println("Enter the present month's readngs: ");
        pre = sc.nextInt();
    }
    void cal()
    {
        call = pre-prv;
        if(call <= 100)
        {
            amt = 0.0;
        }
        if(call > 100 && call <= 200)
        {
            amt = (call-100) * 0.90;
        }
        if(call > 200 && call <= 400)
        {
            amt = 100 * 0.90 + (call-200) * 0.80;
        }
        if(call > 400)
        {
            amt = 100 * 0.90 + 200 * 0.80 + (call - 400) * 0.70;
        }
        total  = amt + 180;
    }
    void display()
    {
        System.out.println("Name \t Calls Made \t Amount to be paid");
        System.out.println(name+" \t "+call+"\t \t "+ total);
    }
    public static void main()
    {
        Telephone tele = new Telephone();
        tele.input();
        tele.cal();
        tele.display();
    }
}
