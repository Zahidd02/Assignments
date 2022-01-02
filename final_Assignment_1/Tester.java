package final_Assignment_1;

public class Tester {
    public static void main(String[] args) {
            
        Circle c1 = new Circle(10.2);
        Circle c2 = new Circle(5.7);

        //Create more objects of Circle class and add to the array given below for testing your code    
        Circle[] allCirces = {c1, c2};
            
        for (Circle circle : allCirces) {
                  
            circle.calculateCircumference();
            circle.calculateArea();
                  
            System.out.println("Diameter of the circle is "+circle.getDiameter());
            System.out.println("Circumference of the circle is " + Math.round(circle.getCircumference()*100)/100.0);
            System.out.println("Area of the circle is " + Math.round(circle.getArea()*100)/100.0);
            System.out.println();
        }           
    }
}
