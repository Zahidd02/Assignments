package Method_Overriding_Assignment_1;

public class OfficeStaff extends Faculty{
    private String designation;

    public OfficeStaff(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        double additionalPay = 0;
        if(this.designation.equals("Accountant")) {
            additionalPay = 10000;            
        }
        else if(this.designation.equals("Clerk")) {
            additionalPay = 7000;
        }
        else if(this.designation.equals("Peon")) {
            additionalPay = 4500;
        }
        return (salary + additionalPay);
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
