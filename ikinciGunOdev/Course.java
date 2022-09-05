package ikinciGunOdev;

public class Course {
    public Course(){
        System.out.println("Ben Çalıştım");
    }
    public Course(int id,String name,int percent,String instructor){
        this();
        this.id=id;
        this.name=name;
        this.percent=percent;
        this.instructor=instructor;
    }
    int id;
    String name;
    int percent;
    String instructor;
        
}
