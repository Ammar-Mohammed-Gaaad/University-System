package AcademicStructure;
import users.Student;
public class Enrollment {
    private String grade;
    private int semester;
    private Student student;
    private Course coruse;
    public Enrollment(){

    }
    public Enrollment(String grade, int semester , Student student , Course coruse){
        this.grade = grade;
        this.semester = semester;
        this.student = student;
        this.coruse = coruse;
    }
    public String getGrade(){
        return grade;
    }
    public int getSemester(){
        return semester;
    }
    public Student getStudent(){
        return student;
    }
    public Course getCoruse(){
        return coruse;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
    public void setStudent(Student student){
        this.student = student;
    }
    public void setCoruse(Course coruse){
        this.coruse = coruse;
    }
    

}
