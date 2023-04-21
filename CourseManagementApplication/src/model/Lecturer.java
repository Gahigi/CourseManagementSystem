
package model;

/**
 *
 * @author Jeni
 */
public class Lecturer {
    private String lecturer_id;
    private String lecturer_names;
    
    //Constructor

    public Lecturer() {
    }

    public Lecturer(String lecturer_id, String lecturer_names) {
        this.lecturer_id = lecturer_id;
        this.lecturer_names = lecturer_names;
    }
    
    //Getters and Setters

    public String getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(String lecturer_id) {
        this.lecturer_id = lecturer_id;
    }

    public String getLecturer_names() {
        return lecturer_names;
    }

    public void setLecturer_names(String lecturer_names) {
        this.lecturer_names = lecturer_names;
    }
    
}
