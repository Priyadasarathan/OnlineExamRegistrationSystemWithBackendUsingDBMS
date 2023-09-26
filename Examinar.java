package onlineExam; 

import java.util.*; 

import java.sql.SQLException; 

import java.text.ParseException; 

import java.text.SimpleDateFormat; 

 

public class Examinar { 

    String studentName; 

    int rigisterNo; 

    Date date; 

 

    Examinar(){ 

        Scanner scanner = new Scanner(System.in); 

        System.out.println("enter name of student"); 

        studentName = scanner.next(); 

        System.out.println("Enter the student rigister number"); 

        rigisterNo = scanner.nextInt(); 

        System.out.println("Enter date dd-mm-yyyy"); 

        String dateInput = scanner.next(); 

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 

        try { 

            date = dateFormat.parse(dateInput); 

     } catch (ParseException e) { 

        //TODO Auto-blockgenerated catch  

        e.printStackTrace(); 

        } 

 

     } 

    public boolean isAvailable() throws SQLException{ 

     Examdataaccessobject examdataaccessobject = new Examdataaccessobject(); 

    Examinardataaccessobject examinardataaccessobject = new Examinardataaccessobject(); 

        int capacity = examdataaccessobject.getCapacity(rigisterNo); 

        int examfinished = examinardataaccessobject.getExamfinishedCount(rigisterNo,date); 


    return examfinished<capacity; 

    } 

 

} 

 