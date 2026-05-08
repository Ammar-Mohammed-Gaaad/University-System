package operations;
class Student {
    int id;
    String name;
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
}
    class Assignment{
        int id;
        String title;
        public Assignment(int id, String title){
            this.id=id;
            this.title=title;
        }
    }
           class Submission{
            int id;
            Student student;
            Assignment assignment;
            String submissionDate;
            double grade;
            public Submission(int id, Student student, Assignment assignment, String submissionDate, double grade){
                this.id=id;
                this.student=student;
                this.assignment=assignment;
                this.submissionDate=submissionDate;
                this.grade=grade;
            }
            public void display(){
                System.out.println("Submission ID: "+id);
                System.out.println("Student ID: "+student.id);
                System.out.println("Student Name: "+student.name);
                System.out.println("Assignment ID: "+assignment.id);
                System.out.println("Assignment Title: "+assignment.title);
                System.out.println("Submission Date: "+submissionDate);
                System.out.println("Grade: "+grade);
            }
        }

public class AssignmentSubmission {
    public static void main(String[] args) {
        Student s = new Student(1, "John");
        Assignment a = new Assignment(1, "Math");
        Submission sub = new Submission(1, s, a, "2023-01-01", 95.0);
        sub.display();
    }
}
    

