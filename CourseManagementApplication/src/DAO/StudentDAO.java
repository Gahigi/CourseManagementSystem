
package DAO;

import java.sql.*;
import model.*;

/**
 *
 * @author Jeni
 */
public class StudentDAO {
    private String dbURL = "jdbc:postgresql://localhost:5432/CourseManagementApp";
    private String Username = "postgres";
    private String password = "Mika";
    public String saveStudent(Student stud) {
        try {
              //Register driver
            DriverManager.registerDriver(new org.postgresql.Driver());
            
              //Create connection
            Connection conn = DriverManager.getConnection(dbURL, Username, password);
            Statement st = conn.createStatement();
            String sql = "insert into person (id,names,type) values ('"+stud.getStudent_id()+"', '"+stud.getStudent_names()+"', 'student')";
           
              //Execute statements
            int nbrOfRowsAffected = st.executeUpdate(sql);
            if(nbrOfRowsAffected >= 1) {
                return "Data Saved Successfully!";
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return "Data Not Saved!";
    }
    public ResultSet getAllStudents() {
        try{
              //Register driver
            DriverManager.registerDriver(new org.postgresql.Driver());
            
              //Create connection
            Connection conn = DriverManager.getConnection(dbURL, Username, password);
            Statement st = conn.createStatement();
            String sql = "select * from person where type='student'";
            
              //Execute statement
            ResultSet result = st.executeQuery(sql);
            return result;
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public void updateStudent(String studentId, String course_id ) {
        try {
              //Register driver
            DriverManager.registerDriver(new org.postgresql.Driver());
            
              //Create connection
            Connection conn = DriverManager.getConnection(dbURL, Username, password);
            Statement st = conn.createStatement();
            String sql = "update person='"+course_id+"' where id='"+studentId+"' and type='student'";
            
              //Execute statements
            st.executeUpdate(sql);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

