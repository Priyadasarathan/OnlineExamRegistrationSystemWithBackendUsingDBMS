package onlineExam; 

 

import java.sql.*; 

 

public class Examdataaccessobject { 

    public void displayExamInfo() throws SQLException { 

    String query = "select * from exam"; 

    Connection connection = Databaseconnection.getConnection(); 

    Statement statement = connection.createStatement(); 

    ResultSet resultSet = statement.executeQuery(query); 

 

    while(resultSet.next()) { 

    System.out.println("rigisterNo:" + resultSet.getInt(1)); 

    if(resultSet.getInt(2)==0) 

    System.out.println("exam: no exam"); 

    else 

        System.out.println("exam: yes you have exam"); 

     System.out.println("Capacity:" + resultSet.getInt(3)); 

      } 

         System.out.println("----------------------------------------------"); 

     } 

     public int getCapacity(int id) throws SQLException { 

         String query = "select capacity from exam where id=" + id; 

        Connection connection = Databaseconnection.getConnection(); 

        Statement statement = connection.createStatement(); 

        ResultSet resultSet = statement.executeQuery(query); 

        resultSet.next(); 
        return resultSet.getInt(1); 

 
     } 

} 