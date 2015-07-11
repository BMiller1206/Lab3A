//*****************************************************************************
//Name: Brent Miller
//Date: 062015
//Project Name: Lab3a
//Description: This project is an example of FileIO. 
//*****************************************************************************
package lab3a;

import java.io.FileReader; 
import java.io.PrintWriter; 
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

//Lab3a Class
public class Lab3A 
{    
    //main
    public static void main(String[] args) throws FileNotFoundException
    {
        DecimalFormat twoDecimal = new DecimalFormat("$###,###,###.00");
        //declare and initialize the variables
        String fName = "", lName = "", jobTitle = "", line = null;
        int idNum = 0;
        double salary = 0.0;     

        Scanner inFile = new Scanner(new FileReader("personelInfo.txt"));

        //Opens the file for writeablility
        PrintWriter outFile = new PrintWriter("personelInfo.out");          

       for (int i=1; i<=4; i++)
       {
           if (i <=3)
           {               
                fName = inFile.next();
                lName = inFile.next();
                idNum = inFile.nextInt();
                jobTitle = inFile.next();
                salary = inFile.nextDouble();    

                //Actually writes to the opened file
                outFile.println("Employee Name: " + fName + " " + lName);        
                outFile.printf("Employee ID Number: " + idNum);       
                outFile.println("\nEmployee Job Title: " + jobTitle);                
                outFile.printf("Employee Salary: " + twoDecimal.format(salary) + "\n\n");
           }//end if
       }//end for   
        
        inFile.close();
        outFile.close();        
    }//end main    
}//end Lab3a Class
