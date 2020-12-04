public class RegularPolygon extends GeometricObject{
    private int n ; //default number of sides.
    private double side ; //default side length.
    private double x ; //x coordinate of the polygon center.
    private double y ; //y coordinate of the polygon center.

RegularPolygon(){
    n = 3;
    side = 1;
    x = 0;
    y = 0;
}
RegularPolygon(int n, double side){
    this.n = n;
    this.side = side;
}
RegularPolygon(int n, double side, double x, double y){
    this.n = n;
    this.side = side;
    this.x = x;
    this.y = y;
}
public void setN(int n){
    this.n = n;
}
public int getN(){
    return n;
}
public void setSide(double side){
    this.side = side;
}
public double getSide(){
    return side;
}
public void setX(double x){
    this.x = x;
}
public double getX(){
    return x;
}
public void setY(double y){
    this.y = y;
}
public double getY(){
    return y;
}
double getPerimeter(){
    return (n*side);
}
double getArea(){
    return (n*side*side)/(4*Math.tan(Math.PI/n));
}
public String toString(){
    return "RegularPolygon: number of sides =" +n +"side length =" +side;
}


}   