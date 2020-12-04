    // Implement your Student class here

public class Student extends User implements Classroom {
    private static int idGen = 10000;
    private Course studycourse;
private Student(){
    idGen++;
}
public Student(String firstname, String lastname){
    super(String.valueOf(idGen), Domain.Student, firstname, lastname);
    idGen++;
} 
public Student(String firstname, String lastname, String birthdate){
    super(String.valueOf(idGen), Domain.Student, firstname, lastname, birthdate);
    idGen++;
}
public void setStudyCourse(Course studycourse){
    this.studycourse = studycourse;
}
public Course getStudyCourse(){
    return this.studycourse;
}
public void setStudyCourse(String course){
    this.studycourse = Course.valueOf(course);
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

