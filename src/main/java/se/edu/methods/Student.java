package se.edu.methods;

// Student.java
public class Student {
    private String name;
    private Course course;

    public Student(Course course, String name) {
        this.course = course;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }

    public void showCourseInfo() {
        System.out.println("Student " + name + " is registered in the course: " + course.getName());
    }
}