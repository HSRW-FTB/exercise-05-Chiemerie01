    import java.util.Date;
    // Implement your Student class here

public class Student extends User {
    private int id;
    private static int idGen = 10000;
    private StudyCourse studycourse;
    private String firstname;
    private String lastname;
    private Date birthdate;
private Student(){
    id = idGen;
    idGen++;
}
public Student(String firstname, String lastname){
    super(Integer.toString(idGen), Domain.Student, firstname, lastname);
    idGen++;
} 
public Student(String firstname, String lastname, Date birthdate){
    super(Integer.toString(idGen), Domain.Student, firstname, lastname, birthdate);
    idGen++;
}
public void setStudyCourse(StudyCourse studycourse){
    this.studycourse = studycourse;
}
public StudyCourse getStudyCourse(){
    return this.studycourse;
}
public void setStudyCourse(String studycourse){
    this.studycourse = StudyCourse.valueOf(studycourse);
}
public String getStudyCourseDescription(){
   switch(studycourse){
        case ME: 
            return "Mechanical Engineering, B.Sc.";
        case MSE:
            return "Mechatronic Systems Engineering, B.Sc.";
        case EL:
            return "Electrical Engineering, B.Sc.";
        case IE:    
            return "Industrial Engineering, B.Sc.";
        case BMS:    
            return "Bionics/Biomimetics, M.Sc.";
        case SCB: 
            return "Science Communication & Bionics, B.Sc.";
        case MME: 
            return "Mechanical Engineering, M.Sc.";
        case MBB: 
            return "Bionics, M.Sc." ;
        default:
            return "No Study Course" ;             

   }

}
}

