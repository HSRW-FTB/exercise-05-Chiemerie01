import java.util.*;
public class Course2 implements Classroom {
    private String id;
    private String name;
    private Professor lecturer;
    private int credit;
private Course2(){
    
}   
public Course2(String id, String name, Professor lecturer, int credit){
    this.id = id;
    this.name = name;
    this.lecturer = lecturer;
    this.credit = credit;
}
public String getID(){
    return id;
} 
public void setName(String name){
    this.name = name;
}
public String getName(){
    return name;
}
public void setLecturer(String lecturer){
    this.lecturer = lecturer;
}
public String getLecturer(){
    return lecturer;
}
public void setCredit(int credit){
    this.credit = credit;
}
public int getCredit(){
    return credit;
}
}
