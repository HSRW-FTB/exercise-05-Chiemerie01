public class TestBucket {
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
        System.out.println("X for Polygon 1 is " +pol1.getX()); 
        System.out.println("Y for Polygon 2 is " +pol2.getY()); 
        System.out.println("N for Polygon 1 is " +pol1.getN()); 
        System.out.println(bucket.toString()); 
        System.out.println(+pol2.getSide());
        System.out.println(+pol1.getPerimeter());
        System.out.println(+pol2.getPerimeter());
        System.out.println(+pol1.getArea());
        System.out.println(+geo.getArea());
        System.out.println(+bucket.getTotalArea());
        System.out.println(+bucket.getTotalPerimeter());
        System.out.println(+pol2.toString());
        System.out.println(+pol2.getColor());
        System.out.println();


        
        System.out.println("The total perimeter is " +BucketOfObjects.getTotalPerimeter());
        System.out.println("The total area is " +BucketOfObjects.getTotalArea());

    }
}
