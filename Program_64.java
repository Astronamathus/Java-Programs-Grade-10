//Program_64
/*Write a program to declare a class Student with integer data type for roll number, string for 
 * name and standard and char for section. The class must have functions for input() 
 * (assign values), print the main function to create an object and to call the functions.*/
//3.7.23
//Suday Dutta
//Greenwood High
class Student1
{
    int roll_no = 0;
    String name, standard;
    char section;
    void input()
    {
        roll_no  = 27;
        name = "Raju";
        standard = "Eight";
        section = 'A';
    }
    void print()
    {
        System.out.println("Roll number \t Name \t Standard \t Section \t");
        System.out.print("\t"+roll_no+" \t "+name+" \t "+standard+" \t "+section+" \t");
    }
    public static void main()
    {
        Student1 std = new Student1();
        std.input();
        std.print();
    }
}
