//Program_66
/*Write a program with the following specifications:

  Class Name: Rectangle

  Data Members / Instance Variables:

  int length
  int breadth
  int perimeter
  int area
  float area

  Member Functions:

  void inputdata() to accept length and breadth of the rectangle
  void calculate() to find perimeter, area and diagonal of the rectangle
  void outputdata() to print the results*/
//27.7.23
//Suday Dutta
//Greenwood High
import java.util.*;
class Rectangle
{
    int length, breadth, perimeter, area;
    float diagonal; 
    void inputdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth = sc.nextInt();
    }
    void calculate()
    {
        perimeter = 2*(length+breadth);
        area = length*breadth;
        diagonal = (float)Math.sqrt((length*length) + (breadth*breadth));
    }
    void outputdata()
    {
        System.out.println("Area of the rectangle: "+area);
        System.out.println("Perimeter of the rectangle: "+perimeter);
        System.out.println("Diagonal of the rectangle: "+diagonal);
    }
    public static void main()
    {
        Rectangle rectangle = new Rectangle();
        rectangle.inputdata();
        rectangle.calculate();
        rectangle.outputdata();
    }
}
