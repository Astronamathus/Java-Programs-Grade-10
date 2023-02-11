//Program_15
/*Program to intialise an alpha-numeric array and print the content in descending order*/
//9.2.23
//Suday Dutta
//Greenwood High
class Program_15
{
    public static void main()
    {
        String a[] = {"efgh","abcd", "mnop", "ijkl", "qrst"};
        int i, j, index; 
        String small;
        for(i = 0; i < (a.length-1); i++)
        {
            small = a[i];
            index = i;
            for(j = i+1; j<a.length; j++)
            {
                if(a[j] .compareTo(small) > 0)
                {
                    small = a[j];
                    index = j;
                }
            }
            String temp;
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