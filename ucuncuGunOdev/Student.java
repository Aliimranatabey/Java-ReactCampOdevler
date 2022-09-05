package ucuncuGunOdev;

public class Student extends User{
    String myCourse;
    String studentNumber;
    String myInstructor;
    public String getMyInstructor() {
        return myInstructor;
    }
    public void setMyInstructor(String myInstructor) {
        this.myInstructor = myInstructor;
    }
    public String getMyCourse() {
        return myCourse;
    }
    public void setMyCourse(String myCourse) {
        this.myCourse = myCourse;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
