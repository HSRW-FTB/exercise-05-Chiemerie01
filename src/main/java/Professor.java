import java.util.Date;
public class Professor extends User{
    private Faculty faculty = Faculty.TUB;
    private Campus campus = Campus.KLE;
    private int phone = 0;
private Professor(){}  
public Professor(String id, String firstname, String lastname) {
    super(id, Domain.STAFF, firstname, lastname);
} 
public Professor(String id, String firstname, String lastname, Date birthdate){
    super(id, Domain.STAFF, firstname, lastname, birthdate);
}
public void setFaculty(Faculty faculty){
    this.faculty = faculty;
}
public String getFaculty(){
    if (faculty == Faculty.TUB){
        return "Technology and Bionics";
    }
    else if(faculty == Faculty.LS){
        return "Life Sciences";
    }
    else if (faculty == Faculty.GO){
        return "Society and Economics";
    }
    else {
        return "Communication and Environment";
    }

}
public void setPhone(int extension){
        this.phone = extension;
}
public String getPhone(){
    if (campus == Campus.KLE){
        return "+49282180673" + String.valueOf(this.phone);
    }
    else{
        return "+492842908" + String.valueOf(this.phone);
    }
}

}
