public class Course {
    private String id;
    private String name;
    private Professor lecturer;
    private int credit;
private Course(){
    
}   
public Course(String id, String name, Professor lecturer, int credit){
    this.id = id;
    this.name = name;
    this.lecturer = lecturer;
    this.credit = credit;
}
public String getID(){
    return this.id;
} 
public void setName(String name){
    this.name = name;
}
public String getName(){
    return this.name;
}
public void setLecturer(Professor lecturer){
    this.lecturer = lecturer;
}
public Professor getLecturer(){
    return this.lecturer;
}
public void setCredit(int credit){
    this.credit = credit;
}
public int getCredit(){
    return this.credit;
}
}
