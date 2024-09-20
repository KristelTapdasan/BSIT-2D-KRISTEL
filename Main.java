package main;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Grade gr = new Grade();
            
            Product prd = new Product();
            String transaction;
            
            System.out.println("Product CRUD System\n");
            
            do {
                System.out.println("1. Grade");
                System.out.println("2. Account");
                System.out.println("3. Product");
                System.out.println("Enter selection: ");
                
                int select = sc.nextInt();
                
                switch(select) {
                    case 1:
                        gr.getGrade();
                        break;
                    
                    case 3:
                        prd.getProduct();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                System.out.print("Make another transaction? (y/n): ");
                transaction = sc.next();
            } while(transaction.equalsIgnoreCase("y"));
        }
    }
}   
       
//       Grades gr = new Grades();
//       gr.addGrades("Adok", 1001, 3.5, 3.5, 3.5, 1.0);
//       gr.viewGrades();
//       
//       Grades gr1 = new Grades();
//       gr.addGrades("Mike", 1001, 3.5, 3.5, 1.0, 2.0);
//       gr.viewGrades();

//       Grade grd = new Grade();
//       grd.getGradeInput();
       
        
    
