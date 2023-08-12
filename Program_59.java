//Program_59
/*Design a class to input a String and display all the vowels present in it.*/
//15.6.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;
class Program_59{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String below:");
        String input = sc.nextLine();
        System.out.println("The vowels in the String are: ");
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c == 'a' || c == 'A')
                System.out.print(c);
            if(c == 'e' || c == 'E')
                System.out.print(c);
            if(c == 'i' || c == 'I')
                System.out.print(c);
            if(c == 'o' || c == 'O')
                System.out.print(c);
            if(c == 'u' || c == 'U')
                System.out.print(c);
            else
                System.out.print(" ");
        }}}