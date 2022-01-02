package Abstract_Exercise_1;

public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String studentName) {
        super(studentName);
    }

    public void generateResult() {
        int sum = 0;
        float average = 0; 
        for(int i = 0; i < super.getTestScores().length; i++) {
            sum += super.getTestScores()[i];
        }
        average = sum / super.getTestScores().length;
        
        if(average >= 60) {
            super.setTestResult("Pass");
        }
        else
            super.setTestResult("Fail");
    }
}
