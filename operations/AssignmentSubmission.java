package operations;
class student {
    int id;
    string name;
student (int id, string name){
    this id=id;
    this name=name;
}
class assignment{
    int id;
    string title;
    assignment(int id,string title){
        this id=id;
        this title=title;
    }
    class sumbission{
        int id;
        student student;
        assignment assignment;
        string submission date;
        double grade;
        sumbission(int id, student student, assignment assignment,string submission date,double grade){
            this.id=id;
            this.student=student;
            this.assignment=assignment;
            this.submission date=submission date;
            this.grade=grade;
        }
        void display(){
            system.out.println("Submission ID: "+id);
            system.out.println("Student Name: "+student.name);
            system.out.println("Assignment Title: "+assignment.title);
            system.out.println("Submission Date: "+submission date);
            system.out.println("Grade: "+grade);
        

        }
    
    }
    }
}
}
}