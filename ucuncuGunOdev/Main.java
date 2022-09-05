package ucuncuGunOdev;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setId(1);
        student.setName("Ali İmran");
        student.setSurname("Atabey");
        student.setStudentNumber("190541004");
        student.setMyCourse("Java-React Camp");
        student.setMyInstructor("Engin Demiroğ");
        
        Instructor instructor=new Instructor();
        instructor.setId(2);
        instructor.setName("Engin");
        instructor.setSurname("Demiroğ");
        instructor.setNumberOfCourses(5);
        instructor.setMyCourseName("Java-React Camp");

        // User[] users={student,instructor};

        StudentManager studentManager=new StudentManager();
        studentManager.startCourse(student);
        studentManager.buyCourse(student);

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.startCourse(instructor);
        instructorManager.soldToCourse(instructor);
    }
}
