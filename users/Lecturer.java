package users;
public class Lecturer extends User{
    private String title;
    private String department;
    private String officeHours;
    public Lecturer(String name, Long id, String password, String email, String role , String title , String department, String officeHours){
        super(name, id, password ,email,role);
        this.title = title;
        this.department = department;
        this.officeHours = officeHours;
    }
    public String getTitle(){
        return title;
    }
    public String getDepartment(){
        return department;
    }
    public String getOfficeHours(){
        return officeHours;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }
}
