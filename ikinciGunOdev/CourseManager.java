package ikinciGunOdev;

public class CourseManager {
    public void startTrainingCourse(Course course){
        System.out.println(course.name+" : Eğitimi Alındı !");
    }
    public void endCourse(Course course){
        System.out.println("Şu eğitimin sonuna geldiniz : "+course.name);
    }
}
