public class Rectangle extends GeometricObject {
    // inherits all the instance variables from GeometricObject and adds two
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled); // Call the parent constructor
        this.width = width;
        this.height = height; // Deal with the new variable
    }

    void setFilled(int n) { // OVERRIDE / MODIFY
        if (n > 0)
            super.setFilled(true);
        else
            super.setFilled(false);
    }

    void changeColor(String color) { // EXTENSION
        super.setColor(color);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }
    
    public double getPerimeter() {
        return 2*width+2*height;
    }
}
