// write a program to enter the employee details by the user and display it.
//name
//gender
// salary
// hobby
// employee id

import java.io.*;

public class assn10{
    public static void main(String[] args) throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(obj);
        System.out.println("Enter the  name of the employee:");
        String x = br.readLine();
        System.out.println("Enter the  gender of the employee(M or F):");
        char y  = (char) br.read();
        br.skip(2);
        System.out.println("Enter the  salary of the employee:");
        int z = Integer.parseInt(br.readLine());
        System.out.println("Enter the  hobby of the employee:");
        String a = br.readLine();
        System.out.println("Enter the  id of the employee:");
        int b = Integer.parseInt(br.readLine());
        System.out.println("==============================================================================================================");
        System.out.println(" Name:" +x);
        System.out.println("Gender:" +y);
        System.out.println("Salary:" +z);
        System.out.println("Hobby:" +a);
        System.out.println("Employee ID:" +b);

    }
}