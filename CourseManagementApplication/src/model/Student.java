
package model;

/**
 *
 * @author Jeni
 */
public class Student {
    private String student_id;
    private String student_names;
    
    //Constructor

    public Student() {
    }

    public Student(String student_id, String student_names) {
        this.student_id = student_id;
        this.student_names = student_names;
    }
    
    //Getters and Setters

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_names() {
        return student_names;
    }

    public void setStudent_names(String student_names) {
        this.student_names = student_names;
    }
    
}
