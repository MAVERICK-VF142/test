// write a program to perform addition, substraction, multiplication,division.


import java.io.*;

public class assn8 {
    public static void main(String[] args) throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(obj);
        System.out.println("Enter the 1st number :");
        float x = Float.parseFloat(br.readLine());
        System.out.println("Enter the 2nd  number :");
        float y = Float.parseFloat(br.readLine());  
        float a = x+y;
        float b = x-y;
        float c = x*y;
        float d = x/y;
        System.out.println("The addition of the two number is :"+a+" ");
        System.out.println("The substraction of the two number is :"+b+" ");
        System.out.println("The multiplication of the two number is :"+c+" ");
        System.out.println("The division of the two number is :"+d+" ");

        
    }
}
