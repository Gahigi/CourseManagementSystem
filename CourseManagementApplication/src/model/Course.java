
package model;

/**
 *
 * @author Jeni
 */
public class Course {
    private String course_id;
    private String course_name;
    private String lecturer_id_fk;
    
    //Constructor

    public Course() {
    }

    public Course(String course_id, String course_name, String lecturer_id_fk) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.lecturer_id_fk = lecturer_id_fk;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getLecturer_id_fk() {
        return lecturer_id_fk;
    }

    public void setLecturer_id_fk(String lecturer_id_fk) {
        this.lecturer_id_fk = lecturer_id_fk;
    }
}
    