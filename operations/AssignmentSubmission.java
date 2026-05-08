package operations;

           class AssignmentSubmission{
            int id;
           String student;
            String submissionDate;
            double score;
            public AssignmentSubmission(int id,  String student, String submissionDate, double score){
                this.id=id;
                this.student=student;
                this.submissionDate=submissionDate;
                this.score=score;
            }
  public getId(){
    return id;
  }
    public getStudent(){
        return student;
    }
    public getSubmissionDate(){
        return submissionDate;
    }
    public getScore(){
        return score;
    }
    public setId(int id){
        this.id=id;
    }
    public setStudent(String student){
        this.student=student;
    }
    public setSubmissionDate(String submissionDate){
        this.submissionDate=submissionDate;
    }
    public setScore(double score){
        this.score=score;
    }    

