//Program_43
/*Write a class with an overloaded function. Compare as follows:
    void compare(int, int); To compare 2 integers and print the greater integer.
    void compare(char, char); To compare the numeric value of 2 chars and print the greater character.
    void compare(String, String); To compare the length of 2 strings and print the longer of the two.*/
//25.5.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Program_43
{
    public static void compare(int a, int b)
    {
        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);    
    }
    public static void compare(char a, char b)
    {
        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);    
    }
    public static void compare(String a, String b)
    {
        if(a.compareTo(b) > 1)
            System.out.println(a);
        else
            System.out.println(b);
    }
    public static void main()
    {
        System.out.println("Enter you choice below:");
        System.out.println("1) Integer");
        System.out.println("2) Character");
        System.out.println("3) String");
        System.out.print("Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter 2 Strings below:");
                int a = sc.nextInt();
                int b = sc.nextInt();        
                compare(a, b);
                break;
            case 2: 
                System.out.println("Enter 2 Strings below:");
                char c = sc.next().charAt(0);
                char d = sc.next().charAt(0);
                compare(c, d);
                break;
            case 3:
                System.out.println("Enter 2 Strings below:");
                sc.next();
                String e = sc.nextLine();
                String f = sc.nextLine();
                compare(e, f);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}