package AcademicStructure;
import users.Lecturer;
public class Course {
    private String coursecode;
    private String title;
    private String creditHours;
    private Lecturer lecturer;

    public Course(){

    }
    public Course(String coursecode, String title, String creditHours, Lecturer lecturer){
        this.coursecode = coursecode;
        this.title = title;
        this.creditHours = creditHours;
        this.lecturer = lecturer;
    }
    public Lecturer getLecturer(){
        return lecturer;
    }
    public String getCoursecode(){
        return coursecode;
    }
    public String getTitle(){
        return title;
    }
    public String getCreditHours(){
        return creditHours;
    }
    public void setLecturer(Lecturer lecturer){
        this.lecturer = lecturer;
    }
    public void setCoursecode(String coursecode){
        this.coursecode = coursecode;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setCreditHours(String creditHours){
        this.creditHours = creditHours;
    }

}
