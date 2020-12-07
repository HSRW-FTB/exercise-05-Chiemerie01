import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Classroom{
    private String id;
    private Course course;
    private ArrayList<Student> participants = new ArrayList<Student>();
    private String room;
    private String term;

private Classroom(){
    
}
public Classroom(Course course, String room ){
    this.course = course;
    this.room = room;
    Date date = new Date();
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(date);
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;  //month starts from zero

    if (month<10 && month>2){
        term = "SS"+year+"/"+((year+1)%100);
    }
    else{
        term = "WS"+year+"/"+((year+1)%100);
    }
    this.id = course.getID()+"-" +term;
}
public Classroom(Course course, String room, Date date){
    this.course = course;
    this.room = room;
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(date);
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;  //month starts from zero

    if (month<10 && month>02){
        term = "SS"+year+"/"+((year+1)%100);
    }
    else {
        term = "WS"+year+"/"+((year+1)%100);
    }

    this.id = course.getID() +"-" +term;
}

public Course getCourse(){
    return this.course;
}
public void setRoom(String room){
    this.room = room;
}
public String getRoom(){
    return this.room;
}
public String getTerm(){
    return this.term;
}
public String getID(){
    return this.id;
}
public void addStudent(Student student){
    participants.add(student);
}
public String getParticipantsEmail(){
    String emails = "";
    for (int i=0; i<participants.size(); i++ ){
        emails = emails + participants.get(i).getFQUN() + ",";
    }
    return emails.substring(0, emails.length()-2);
}
public int getTotalParticipants(){
    return participants.size();  //ValueOf.participants()
}

}
