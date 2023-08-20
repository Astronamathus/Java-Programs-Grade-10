//Program_72
/*Define a class "Student" described as below:
  
  Data Members / Instance Variables:
  
  String name
  int age, int m1, int m2, int m3, int maximum
  double average
  
  Member Methods:
  
  i) A parameterized constructor to initialize the data members
  ii) To compute() the average and the maximum marks out of the three marks 
  iii) To display() the name, age, marks in 3 subjects, maximum marks, and the average
  
  Write a main method to create an object of a class and call the above member methods*/
//12.8.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Student3
{
    String name;
    int age, m1, m2, m3, maximum;
    double average;
    Student3(String n, int a, int m_1, int m_2, int m_3, int max, double avg)
    {
        name = n;
        age = a;
        m1 = m_1;
        m2 = m_2;
        m3 = m_3;
        maximum = max;
        average = avg;
    }
    void compute()
    {
        if(m1 >= m2 && m1 >= m3)
        {
            maximum = m1;
        }
        if(m2 >= m1 && m2 >= m3)
        {
            maximum = m2;
        }
        if(m3 >= m1 && m3 >= m2)
        {
            maximum = m3;
        }
        average = m1+m2+m3/3.0;
    }
    void display()
    {
        System.out.println("Name of student: "+name);
        System.out.println("Age of student: "+age);
        System.out.println("The marks scored in 1st subject: "+m1);
        System.out.println("The marks scored in 2nd subject: "+m2);
        System.out.println("The marks scored in 3rd subject: "+m3);
        System.out.println("The maximum marks scored: "+maximum);
        System.out.println("The average marks scored: "+average);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name below: ");
        String n = sc.next();
        System.out.println("Enter your age below:");
        int a = sc.nextInt();
        System.out.println("Enter your marks scored in first subject: ");
        int m_1 = sc.nextInt();
        System.out.println("Enter your marks scored in second subject: ");
        int m_2 = sc.nextInt();
        System.out.println("Enter your marks scored in third subject: ");
        int m_3 = sc.nextInt();
        Student3 std = new Student3(n, a, m_1, m_2, m_3, 0, 0.0);
        std.compute();
        std.display();
    }
}
