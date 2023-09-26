package onlineExam; 

import java.util.Date; 

import java.sql.*; 

 

public class Examinardataaccessobject { 

    public int getExamfinishedCount(int rigisterNo,Date date)throws SQLException { 

        String query = "select count(student_name) from examinar where register_no=? and exam_date=?"; 

        Connection connection = Databaseconnection.getConnection(); 

        PreparedStatement pst = connection.prepareStatement(query); 



        java.sql.Date sqldate = new java.sql.Date(date.getTime()); 

        pst.setInt(1, rigisterNo); 

        pst.setDate(2, sqldate); //here only read 

        ResultSet rs = pst.executeQuery(); 

        rs.next(); 

        return rs.getInt(1); 

    } 


    public void addExaminar(Examinar examinar) throws SQLException {    //parameter calling 

        String query = "Insert into examinar values(?,?,?)"; 

        Connection connection = Databaseconnection.getConnection(); 

        java.sql.Date sqldate = new java.sql.Date(examinar.date.getTime()); 

        PreparedStatement pst = connection.prepareStatement(query); 

        pst.setString(1, examinar.studentName); 

        pst.setInt(2, examinar.rigisterNo); 

        pst.setDate(3, sqldate); 

 

        pst.executeUpdate(); //here update 

 
 

    } 

} 