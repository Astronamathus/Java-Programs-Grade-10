//Program_32
/*Program to enter the names of cities into a 'cities' array and the highest and lowest
 * temperatures recorded in he city into a 2-d array 'temperature' (5 cities). Display the city corresponding to 
 * the highest and the lowest temperature*/
//20.2.23
//Suday Dutta
//Greenwood High
import java.util.Scanner;class Program_32{ public static void main(){
        Scanner sc = new Scanner(System.in); 
        String cities[] = new String[5], city_high = " ", city_low = " ";
        int temperatures[][] = new int[2][5], high = temperatures[0][0], low = temperatures[0][0];
        System.out.println("Enter names of 5 cities below: ");
        for(int i = 0; i < 5; i++){
            System.out.print("Name of city "+(i+1)+": ");
            cities[i] = sc.next();}
        System.out.println("Enter the highest and lowest temperatures in the cities:");
        for(int i = 0; i < 5; i++){
            System.out.println("Highest and lowest temperature in "+cities[i]+": ");    
            for(int w = 0; w < 2; w++){
                temperatures[w][i] = sc.nextInt();}}
        for(int i = 0; i < 5; i++){
            for(int w = 0; w < 2; w++){
            if(temperatures[w][i] > high){
                high = temperatures[w][i]; city_high = cities[i];}
            else if(temperatures[w][i] < low)
                low = temperatures[w][i]; city_low = cities[i];}}
        System.out.println("The highest temperature is "+high+" from "+city_high);
        System.out.println("The lowest temperature is "+low+" from "+city_low);}}