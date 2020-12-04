public class BucketOfObjects implements GeometricObject{
    private GeometricObject[] items;
public BucketOfObjects(){
    
}
public void addObject(GeometricObject object){
    this.item = object;
}    
public double getTotalArea(){
    return Circle.getArea()+Triangle.getArea()+RegularPolygon.getArea();
}
public double getTotalPerimeter(){
    return Circle.getPerimeter()+Triangle.getPerimeter()+RegularPolygon.getPerimeter();
}
public String toString(){
    return "Triangle, Circle, Rectangle";
}
    public static void main(String[] args){
        Circle circle1 = new Circle();
        Rectangle rect1 = new Rectangle();
        Triangle tri1 = new Triangle();
        RegularPolygon pol1 = new RegularPolygon(5,2,9,8);
        RegularPolygon pol2 = new RegularPolygon(3,5);
        
        System.out.println("The total perimeter is " +BucketOfObjects.getPerimeter());
        System.out.println("The total area is " +BucketOfObjects.getArea());

    }
}