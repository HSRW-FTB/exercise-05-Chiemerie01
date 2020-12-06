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
    super(Integer.toString(idGen), Domain.Student, firstname,lastname);
    idGen++;
} 
public Student(String firstname, String lastname, String birthdate){
    super(Integer.toString(idGen), Domain.Student, firstname,lastname, birthdate);
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
    int k = 0;
    String[] a1 = {"ME", "MSE", "EL", "IE", "BMS", "SCB", "MME", "MBB"};
    String[] a2 = {"Mechanical Engineering, B.Sc", "Mechatronic System Engineering, B.Sc.", "Electrical and Electronics Engineering, B.Sc,", "Industrial Engineering, B.Sc.","Biomaterials Science, B.Sc.","Science Communication and Bionics, B.A./B:Sc.", "Mechanical Engineering, M.Sc.", "Bionics/Biomimetics, M.Sc."};

    for (int i=0; i<7; i++){
        if(a1[i]==studycourse.name()){
            k = i;
        }
        return a2[k];
    }
}

}

