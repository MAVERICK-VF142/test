// write a program to check the number is even or odd input by the user (usign the bufferedreader)


import java.io.*;
public class assn4 {
    public static void main(String[] args) throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(obj);
        System.out.println("Enter a number:");
        int x = Integer.parseInt(br.readLine());
if (x%2==0)
System.out.println("EVEN");
else
System.out.println("ODD");
}

}