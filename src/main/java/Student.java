    import java.util.Date;
    // Implement your Student class here

import javax.management.MBeanServerBuilder;

import org.graalvm.compiler.asm.sparc.SPARCAssembler.MembarMask;

import jdk.nashorn.internal.runtime.arrays.IntElements;
import sun.reflect.generics.tree.BottomSignature;

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
public Student(String firstname, String lastname, String birthdate){
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
            return "Bionics, M.Sc.";
        default 
            return "No Study Course";               

   }

    for (int i=0; i<7; i++){
        if(a1[i]==studycourse.name()){
            k = i;
        }
        return a2[k];
    }
}

}

