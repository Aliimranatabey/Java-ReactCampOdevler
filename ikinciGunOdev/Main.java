package ikinciGunOdev;

public class Main {
    public static void main(String[] args) {
        Course course1=new Course(1,"Java-React",0,"Engin Demiroğ");
        Course course2=new Course(2,"Senior .Net",0,"Engin Demiroğ");
        Course course3=new Course(3,"MVC .Net",0,"Murat Yücedağ");
        Course course4=new Course(4,"Python Programing",0,"Yunus Santur");
        Course course5=new Course(5,"SQL",0,"Murat Yücedağ");

        Course[] courses={course1,course2,course3,course4,course5};
        
        for(Course course:courses){
            System.out.println(course.instructor);
        }

        CourseManager courseManager=new CourseManager();
        courseManager.startTrainingCourse(course1);
        courseManager.endCourse(course1);
        courseManager.startTrainingCourse(course2);
        courseManager.startTrainingCourse(course3);
        courseManager.startTrainingCourse(course4);
        courseManager.startTrainingCourse(course5);
        
    }
    
}
