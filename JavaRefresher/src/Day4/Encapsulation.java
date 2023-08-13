package Day4;

class Student{
    private String courseName;
    //getters - public

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    //setters - public

}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
     //   System.out.println(s.courseName);
        s.setCourseName("Java Selenium");
        System.out.println(s.getCourseName());
    }
}
