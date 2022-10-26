// write a program to find the largest number input by the user (using buffered reader)

import java.io.*;




public class assn5 {
    public static void main(String[] args) throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(obj);
        System.out.println("Enter the 1st number:");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Enter the 2nd  number:");
        int y = Integer.parseInt(br.readLine());
        if (x>y)
        System.out.println("x is greater than y");
        else if (x ==y)
        System.out.println("x is equal to y");
        else
        System.out.println("y is greater than x");
}
}