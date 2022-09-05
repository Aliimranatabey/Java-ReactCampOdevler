package ucuncuGunOdev;

public class InstructorManager extends UserManager{
    @Override
    public void startCourse(User user){
        System.out.println("Eğitmen Girişi Yapıldı : "+user.getName() +" "+ user.getSurname());
    }

    @Override
    public void soldToCourse(Instructor instructor){
        System.out.println("Şu Kurs Satıldı : "+instructor.getMyCourseName());   
    }
}
