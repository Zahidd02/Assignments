package Array_Assignment_1;

public class Tester {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alex", "Java Fundamentals", 1200L);
        Teacher teacher2 = new Teacher("John", "RDMS", 800L);
        Teacher teacher3 = new Teacher("Sam", "Networking", 900L);
        Teacher teacher4 = new Teacher("Maria", "Python", 900L);
    
        Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4};

        for(Teacher x : teachers) {
            System.out.println("Name : "+x.getTeacherName()+", Subject : "+x.getSubject()+", Salary : "+x.getSalary());
        }
    }
}
