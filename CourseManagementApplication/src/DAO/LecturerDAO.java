
package DAO;

import java.sql.*;
import java.sql.DriverManager;
import model.*;

/**
 *
 * @author Jeni
 */
public class LecturerDAO {
    public String dbURL ="jdbc:postgresql://localhost:5432/CourseManagementApp";
    public String Username = "postgres";
    public String password = "Mika";
    public String saveLecture(Lecturer lect){
        try {
              //Register driver
            DriverManager.registerDriver(new org.postgresql.Driver());
            
              //Create connection
            Connection conn = DriverManager.getConnection(dbURL, Username, password);
            Statement st = conn.createStatement();
            String sql = "insert into person (id,names,type) values ('"+lect.getLecturer_id()+"', '"+lect.getLecturer_names()+"', 'lecturer')";
              
              //Execute statement
            int nbrOfRowsAffected = st.executeUpdate(sql);
            if(nbrOfRowsAffected >= 1) {
                return "Data Saved Successfully!";
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return "Data Not Saved!";
    }

    public ResultSet getAllLecturers() {
        try{
              //Register driver
            DriverManager.registerDriver(new org.postgresql.Driver());
            
              //Create connection
            Connection conn = DriverManager.getConnection(dbURL, Username, password);
            Statement st = conn.createStatement();
            String sql = "select * from person where type='lecturer'";
            
              //Execute statement
            ResultSet result = st.executeQuery(sql);
            return result;
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
}

