//write a program to swap two numbers input by the user using the third variable(buffered reader) 
import java.io.*;

public class assn6 {
    public static void main(String[] args) throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(obj);
        System.out.println("Enter the 1st number you want to swap:");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Enter the 2nd  number you want to swap:");
        int y = Integer.parseInt(br.readLine());  
        System.out.println("Before swapping the numbers are :"+x+" "+y);  
        int t = x;
        x = y;
        y = t;
        System.out.println("After swapping swapping the numbers are :"+x+" "+y);  

}
}