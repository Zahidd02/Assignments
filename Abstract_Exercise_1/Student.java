package Abstract_Exercise_1;

abstract public class Student {
    private String studentName;
    private int[] testScores;
    private String testResult;

    public Student(String studentName) {
        this.studentName = studentName;
        testScores = new int[4];
    }

    abstract public void generateResult();

    public void setTestScore(int testNumber, int testScore) {
        this.testScores[testNumber] = testScore;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getTestScores() {
        return this.testScores;
    }

    public String getTestResult() {
        return this.testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
}
