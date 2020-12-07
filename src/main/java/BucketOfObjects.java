import java.util.ArrayList;
public class BucketOfObjects {
    private ArrayList <GeometricObject> items = new ArrayList<GeometricObject>();
public BucketOfObjects(){
    
}
public void addObject(GeometricObject object){
    items.add(object);
}    
public double getTotalArea(){
    double totalArea = 0.0;
    for (int i = 0; i < items.size(); i++){
        totalArea += items.get(i).getArea();
    }
    return totalArea;
}
public double getTotalPerimeter(){
    double totalPerimeter = 0.0;
    for (int i = 0; i < items.size(); i++){
        totalPerimeter += items.get(i).getPerimeter();
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
}