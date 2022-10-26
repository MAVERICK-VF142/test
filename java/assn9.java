// write a program to display a floating point value input by the user
import java.io.*;

public class assn9 {
    public static void main(String[] args) throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(obj);
        System.out.println("Enter the  number you want the floating point value:");
        int x = Integer.parseInt(br.readLine());
        float y = x;
        System.out.println("The floating point value is :"+y+" ");
    }
}