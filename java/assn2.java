// write a program to enter and display what you have entered 



import java.io.*;

public class assn2 {
  public static void main(String[] args) throws IOException{
    InputStreamReader obj = new InputStreamReader(System.in);
    BufferedReader br  = new BufferedReader(obj);
    System.out.println("ENTER:");
    String x = br.readLine();
    System.out.println("you have entered:" +x);
  }  
}
