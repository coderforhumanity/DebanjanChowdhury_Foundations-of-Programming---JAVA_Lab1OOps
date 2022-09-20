package com.lab1oops.debanjan;
import java.util.Scanner;
public class Department {


   public String selectDepartments()
   {
       System.out.println("Please enter the department from the following");
       System.out.println("1. Technical");
       System.out.println("2. Admin");
       System.out.println("3. Human Resource");
       System.out.println("4. Legal");

       Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();
       switch(choice)
       {
           case 1 : return "tech";

           case 2 : return "admin";


           case 3 : return "hr";


           case 4 : return "legal";

           default: return "Wrong Choice";
       }
   }
}
