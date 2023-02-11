//Program_7
/*Two single dimensinal arrays contain values as follows:
   X[10] = {5, -3, -2, 1, 0, 12, 14, 16, 25, 13}
   Y[8] = {6, 5, 10, 15l 18, 20, 22, 30}
   
   Write a program that results in a third array as follows:
   Z[18] = {5, 6, -3, 5, -2, 10, 1, 15, 0, 18, 12, 20, 14, 22, 16, 30, 25, 13}*/
//30.1.23
//Suday Dutta
//Greenwood High
class Program_7
{
    public static void main()
    {
        int X[] = {5, -3, -2, 1, 0, 12, 14, 16, 25, 13};
        int Y[] = {6, 5, 10, 15, 18, 20, 22, 30};
        int Z[] = new int[18];
        for(int i = 0, j = 1; i < (X.length + Y.length); i++)
        {
            if(i%2==0)
            {
                    Z[i] = X[i/2];
            }
            else
            {
                if(i-j >= Y.length)
                {
                    break;
                }
                    Z[i] = Y[i-j];
                    j++;
            }
        }
        for(int i = (X.length + Y.length) - 1; i < Z.length; i++)
        {
            Z[i] = X[(i/2) + 1];
        }
        for(int i =0; i < Z.length; i++)
        {
            System.out.println(Z[i]);
        }
    }
}