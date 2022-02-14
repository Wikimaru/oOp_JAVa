package week6lab2;

public class Week6Lab2 {

    public static void main(String[] args)
    {
        Course course = new Course("Math");
        course.addStudent("NIceGuy");
        course.addStudent("NiceTryRocket");
        course.addStudent("A");
        course.addStudent("B");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
           System.out.println("Student " + (i + 1) + " is " + course.getStudents().get(i));
        }
        course.dropStudent("A");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
           System.out.println("Student " + (i + 1) + " is " + course.getStudents().get(i));
        }
        course.clear();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
           System.out.println("Student " + (i + 1) + " is " + course.getStudents().get(i));
        }
    }
    
}
