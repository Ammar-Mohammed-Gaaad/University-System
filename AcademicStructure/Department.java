package AcademicStructure;
import users.Lecturer;
import java.util.List;
public class Department {
    private Long id;
    private String name;
    private Lecturer headOfDepartment;
    private List<Course> courses; 
    public Department(){

    }
    public Department(Long id , String name ,Lecturer headOfDepartment , List<Course> courses){
        this.id = id;
        this.name = name;
        this.headOfDepartment = headOfDepartment;
        this.courses = courses;
    }
    public Long getId(){

        return id;
    }
    public String getName(){
        return name;
    }
    public Lecturer getHeadOfDepartment(){
        return headOfDepartment;
    }
    public List<Course> getCourses(){
        return courses;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHeadOfDepartment(Lecturer headOfDepartment){
        this.headOfDepartment = headOfDepartment;
    }
    public void setCourses(List<Course> courses){
        this.courses = courses;
    }

}
