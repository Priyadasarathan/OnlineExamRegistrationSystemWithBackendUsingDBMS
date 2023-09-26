package onlineExam; 

import java.sql.SQLException; 

import java.util.Scanner; 

 
 
 

public class OnlineExam { 

    public static void main(String[] args) throws SQLException{ 




    Examdataaccessobject examdataaccessobject = new Examdataaccessobject(); 

    try{ 

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Online exam registration system"); 

        System.out.println("Student name"); 

        System.out.println("requird password"); 

 

        scanner.nextLine(); //student new line 

        System.out.println("Enter student name"); 

        String studentname = scanner.nextLine(); 

        System.out.println("Enter password"); 

        String password = scanner.nextLine(); 



        System.out.println("Student login successfully!!!!!"); 





 

        examdataaccessobject.displayExamInfo(); 

        int userOpt = 1; 

        Scanner scanner1 = new Scanner(System.in); 

 

        while(userOpt == 1){ 

        System.out.println("Enter 1 to go for Exam Registration and 2 to go for exit"); 

        userOpt = scanner1.nextInt(); 

        if(userOpt == 1){ 

            Examinar examinar = new Examinar(); 

                if(examinar.isAvailable()){ 

                    Examinardataaccessobject examinardataaccessobject = new Examinardataaccessobject(); 

                    examinardataaccessobject.addExaminar(examinar); 

                    System.out.println("your exam is rigisted"); 

                } 

                else 

                    System.out.println("Sorry. your already finished your exam."); 

 

                } 

 

        } 

        scanner.close(); 

        scanner1.close(); 

     } 

     catch(Exception e){ 

        System.out.println("Server down please try again"); 

    } 

} 

} 