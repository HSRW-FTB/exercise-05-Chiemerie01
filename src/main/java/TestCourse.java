public class TestCourse {
    public static void main(String[] args){

        Professor prof1 = new Professor("xyq", "X", "Yq");
        Course oop = new Course("EL-2309", "Object Oriented Programming", prof1,5);

        System.out.println("The course name is, " +oop.getName() +"The lecturer is " +oop.getLecturer());
        System.out.println("The course ID is, " +oop.getID() +"The course credit is " +oop.getCredit());

    }
}
