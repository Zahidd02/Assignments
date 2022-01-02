package final_Assignment_1;

public class Circle {
    private final double PI = 3.14;
    private double diameter;
    private double circumference;
    private double area;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public void calculateCircumference() {
        this.circumference = this.PI * this.diameter;
    }

    public void calculateArea() {
        this.area = this.PI * Math.pow(this.diameter/2, 2);
    }

    public double getDiameter() {
        return this.diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getCircumference() {
        return this.circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
    
    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPI() {
        return this.PI;
    }
}
