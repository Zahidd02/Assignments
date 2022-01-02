package Method_Overriding_Assignment_1;

public class Faculty {
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;

    public Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonusPercentage = 4F;
        this.carAllowancePercentage = 2.5F;
    }

    public double calculateSalary() {
        double totalSalary = this.basicSalary + (this.bonusPercentage/100 * this.basicSalary) + (this.carAllowancePercentage/100 * this.basicSalary);
        return totalSalary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusPercentage() {
        return this.basicSalary;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public float getCarAllowancePercentage() {
        return this.carAllowancePercentage;
    }

    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }

}
