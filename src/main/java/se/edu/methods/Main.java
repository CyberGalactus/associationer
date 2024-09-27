package se.edu.methods;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Cloud Developer AWS");
        Student student = new Student(course, "Edu");
        student.showCourseInfo();
    }
}
