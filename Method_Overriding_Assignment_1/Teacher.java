package Method_Overriding_Assignment_1;

public class Teacher extends Faculty{
    private String qualification;

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        double additionalPay = 0;
        if(this.qualification.equals("Doctoral")) {
            additionalPay = 20000;
        }
        else if(this.qualification.equals("Masters")) {
            additionalPay = 18000;
        }
        else if(this.qualification.equals("Bachelors")) {
            additionalPay = 15500;
        }
        else if(this.qualification.equals("Associate")) {
            additionalPay = 10000;
        }
        return (salary + additionalPay);
    }

    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
