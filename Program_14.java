//Program_14
/*Program to intialise an array with 5numeric elements and print the array in ascending order using selection sort*/
//9.2.23
//Suday Dutta
//Greenwood High
class Program_14
{
    public static void main()
    {
        int a[] = {5, 3, 4, 2, 1};
        int i, j, index, small;
        for(i = 0; i < (a.length-1); i++)
        {
            small = a[i];
            index = i;
            for(j = i+1; j<a.length; j++)
            {
                if(a[j] < small)
                {
                    small = a[j];
                    index = j;
                }
            }
            int temp;
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        for(i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}