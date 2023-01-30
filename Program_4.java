//Program_4
/*Program to initialise an array of 5 elements and print their sum and average*/
//30.1.23
//Suday Dutta
//Greenwood High
class Program_4
{
    public static void main()
    {
        int sum = 0;
        double average;
        int a[] = {5, 10, 15, 20, 25};
        for(int i=0; i<5; i++)
        {
            sum += a[i];
        }
        average = sum/5.0; //Guess who just avoided integer division 
        System.out.println("The sum of the elements of the array is: "+sum);
        System.out.println("The average of the elements of the array is: "+average);
    }
}