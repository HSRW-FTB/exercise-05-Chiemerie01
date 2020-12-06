import java.util.Date;
public interface Classroom{
    private String id;
    private Course course;
    private Student[] participants;
    private String room;
    private String term;
private Classroom(){
    this.id = id;
    this.course = course;
    this.participants = participants;
    this.room = room;
    this.term = term;
}
public Classroom(Course course, String room ){
    this.course = course;
    this.room = room;
}
public Classroom(Course course, String room, Date date){
    this.course = course;
    this.room = room;
    this.date = date;
}

public Course getCourse(){
    return course;
}
public void setRoom(String room){
    this.room = room;
}
public String getRoom(){
    return room;
}
public String getTerm(){
    if Month.getValue() >= 10  && Month.getValue() <= 02{
  return "WS" +Year.now.getValue() +"/" +NextYear.getValue();
}
else if Month.getValue() >= 03 && Month.getValue() <= 09{
  return "SS" +Year.getValue();
}
}
public String getID(){
    return id;
}
public void addStudent(Student newStudent){
    student = newStudent;
}
public String getParticipantsEmail(){
    return id +"@student.hsrw";

}
public int getTotalParticipants(){

}

}
