package ucuncuGunOdev;

public class Instructor extends User {
    int numberOfCourses;
    String myCourseName;

    public String getMyCourseName() {
        return myCourseName;
    }

    public void setMyCourseName(String myCourseName) {
        this.myCourseName = myCourseName;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }
}
