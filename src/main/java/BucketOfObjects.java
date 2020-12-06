public interface BucketOfObjects {
    private GeometricObject items;
public BucketOfObjects(){
    
}
public void addObject(GeometricObject object){
    this.items = object;
}    
public double getTotalArea(){
    return circ1.getArea() + tri1.getArea() + rect1.getArea() + pol1.getPerimeter() + pol2.getPerimeter();
}
public double getTotalPerimeter(){
    return circ1.getPerimeter() + tri1.getPerimeter() + rect1.getPerimeter() + pol1.getPerimeter() + pol2.getPerimeter();
}
public String toString(){
    return "Triangle, Circle, Rectangle";
}
    public static void main(String[] args){
        GeometricObject circ1 = new Circle(4);
        GeometricObject rect1 = new Rectangle(6,4);
        GeometricObject tri1 = new Triangle(6,5,9);
        GeometricObject pol1 = new RegularPolygon(5,2,9,8);
        GeometricObject pol2 = new RegularPolygon(3,5);
        
        System.out.println("The total perimeter is " +BucketOfObjects.getTotalPerimeter());
        System.out.println("The total area is " +BucketOfObjects.getTotalArea());

    }
}