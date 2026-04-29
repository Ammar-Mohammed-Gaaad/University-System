package users;
public class Student extends User{
    private String major;
    private int enrollmentYear;
    private double gpa;
    private String studentId;
    public Student(String name ,Long id, String password , String email ,String role,String major,int enrollmentYear ,double gpa, String studentid ){
        super(name, id, password, email, role);
        this.major = major;
        this.enrollmentYear = enrollmentYear;
        this.gpa = gpa;
        this.studentId = studentid;
    }
    public String getMajor(){
        return major;
    }
    public int getEnrollmentYear(){
        return enrollmentYear;
    }
    public double getGpa(){
        return gpa;
    }
    public String getStudentId(){
        return studentId;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public void setMajor(String major){
        this.major = major;
    }
    
}
