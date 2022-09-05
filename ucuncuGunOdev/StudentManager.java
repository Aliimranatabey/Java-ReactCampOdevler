package ucuncuGunOdev;

public class StudentManager extends UserManager{
    @Override
    public void startCourse(User user){
        System.out.println("Öğrenci Girişi Yapıldı: "+user.getName());
    }
    @Override
    public void buyCourse(Student student){
        System.out.println("Şu Kurs Alındı : "+student.getMyCourse() + " " + student.getMyInstructor());
    }

    
}
