
public class Circle extends GeometricObject {
    private double radius;
    
public Circle() {
}
    
public Circle(double radius) {
    this.radius = radius;
}
    
public Circle(double radius, String color, boolean filled) {
    this.radius = radius;
} 
    
public double getArea() {
    return radius * radius * Math.PI;
}

public double setRadius(double radius){
    this.radius = radius;
}
    
public double getRadius() {
    return radius;
}
    
public double getPerimeter() {
    return 2 * radius * Math.PI;
}
    
public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
}
    
public String toString() {
    return "Circle created on " + getDateCreated() + "\ncolor: " + this.getColor() + " and filled: "
    + this.isFilled() + " radius: " + radius;
}

}
    

