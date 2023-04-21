
package DAO;

import java.sql.Connection;
import java.sql.*;
import model.*;

/**
 *
 * @author Jeni
 */
public class CourseDAO {
    public String dbURL = "jdbc:postgresql://localhost:5432/CourseManagementApp";
    public String Username = "postgres";
    public String password = "Mika";
    public String saveCourse(Course course) {
        try {
              //Register driver
            DriverManager.registerDriver(new org.postgresql.Driver());
            
              //Create connection
            Connection conn = DriverManager.getConnection(dbURL, Username, password);
            Statement st = conn.createStatement();
            String sql = "insert into course (id,names,lecturer_id) values ('"+course.getCourse_id()+"', '"+course.getCourse_name()+"', '"+course.getLecturer_id_fk()+"')";
             
              //Execute statement
            int nbrOfRowsAffected = st.executeUpdate(sql);
            if(nbrOfRowsAffected >=1) {
                return "Data Saved Successfully!";
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return "Data Not Saved!";
    }
}
