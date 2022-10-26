// write a program to display the number input by the user
import java.io.*;
public class assn3 {
   
        public static void main(String[] args) throws IOException{
            InputStreamReader obj = new InputStreamReader(System.in);
            BufferedReader br  = new BufferedReader(obj);
            System.out.println("Enter a number:");
            int x = Integer.parseInt(br.readLine());
            System.out.println("you have entered this number:"+x);
    }
    
}
