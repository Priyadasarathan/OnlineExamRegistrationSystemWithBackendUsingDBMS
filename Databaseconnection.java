
 package onlineExam; 

 

import java.sql.*; 

 
 

public class Databaseconnection { 

    private static final String url = "jdbc:mysql://localhost:3306/onlineexamregister"; 

    private static final String userName = "root"; 

    private static final String password = "root@123"; 


    public static Connection getConnection() throws SQLException{ 

    return DriverManager.getConnection(url, userName, password); 

} 

} 
    
