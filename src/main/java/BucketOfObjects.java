import java.util.ArrayList;
public class BucketOfObjects {
    private ArrayList <GeometricObject> items = new ArrayList<GeometricObject>();
public BucketOfObjects(){
    
}
public void addObject(GeometricObject object){
    items.add(object);
}    
public static double getTotalArea(){
    double totalArea = 0.0;
    for (int i = 0; i< items.size(); i++){
        totalArea = totalArea + items.get(i).getArea();
    }
    return totalArea;
}
public static double getTotalPerimeter(){
    double totalPerimeter = 0.0;
    for (int i = 0; i < items.size(); i++){
        totalPerimeter = totalPerimeter + items.get(i).getPerimeter();
    }
    return totalPerimeter;
}
public String toString(){
    String str = "";
    for (int i = 0; i < items.size(); i++){
        str = str + items.get(i).getClass().getSimpleName() +",";
    }
    return str.substring(0, str.length() - 2);
}
    public static void main(String[] args){
        Triangle tri1 = new Triangle(5,5,5);
        Triangle tri2 = new Triangle(3,5,4);
        GeometricObject geo = tri2;
        tri2.setColor("blue");
        RegularPolygon pol1 = new RegularPolygon(6,4);
        RegularPolygon pol2 = new RegularPolygon(10,4,5.6,7.8);
        GeometricObject obj2 = new Rectangle();
        GeometricObject obj3 = new Circle();
        geo = pol2;
        BucketOfObjects bucket = new BucketOfObjects();
        bucket.addObject((GeometricObject) tri1);
        bucket.addObject((GeometricObject) pol1);
        bucket.addObject(obj2);
        bucket.addObject(geo);
        bucket.addObject(new Circle());
        bucket.addObject((GeometricObject) tri2);
        bucket.addObject((GeometricObject) pol2);
        geo.setColor("red");
        pol1.getX();
        pol2.getY();
        pol1.getN();
        bucket.toString();        
        
        System.out.println("The total perimeter is " +BucketOfObjects.getTotalPerimeter());
        System.out.println("The total area is " +BucketOfObjects.getTotalArea());

    }
}