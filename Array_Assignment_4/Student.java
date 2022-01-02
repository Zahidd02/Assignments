package Array_Assignment_4;

public class Student {
    private int[] marks;
    private char[] grade;

    public Student(int[] marks) {
        this.marks = marks;
        grade = new char[marks.length];
    }

    public void findGrade() {
        for(int i = 0; i < this.marks.length; i++){
            if(this.marks[i] >= 92) {
                this.grade[i] = 'E';
            }
            else if(this.marks[i] >= 85 && this.marks[i] < 92) {
                this.grade[i] = 'A';
            }
            else if(this.marks[i] >= 70 && this.marks[i] < 85) {
                this.grade[i] = 'B';
            }
            else if(this.marks[i] >= 65 && this.marks[i] < 70) {
                this.grade[i] = 'C';
            }
            else if(this.marks[i] < 92) {
                this.grade[i] = 'D';
            }
        }
    }

    public int[] getMarks() {
        return this.marks;
    }
 
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public char[] getGrade() {
        return this.grade;
    }
 
    public void setGrade(char[] grade) {
        this.grade = grade;
    }
}
