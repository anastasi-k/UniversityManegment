import java.util.Arrays;

public class Student extends Person {
    private String studentID;
    private double averageGrade;
    private String[] courses;
    private final int MAX_COURSES;

    public Student(
            String fullName,
            int age,
            String gender,
            String studentID,
            double averageGrade,
            String[] courses) {
        super(fullName, age, gender);

        this.studentID = studentID;
        this.averageGrade = averageGrade;
        this.courses = courses != null ? courses : new String[]{"Philosophy", "Math", "English"};
        MAX_COURSES = 5;
    }

    public void enrollCourse(String courseName) {
        courses = Arrays.copyOf(courses, courses.length + 1);
        courses[courses.length - 1] = courseName;
        System.out.println("Course " + courseName + " successfully added");
            if (courses.length >= MAX_COURSES) {
            System.out.println("Course limit reached");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\t\n=====Additional information=====");
        System.out.println("Student ID: " + studentID);
        System.out.println("Average grade: " + averageGrade);
        System.out.println("Courses " + "(" + courses.length + "): ");
        for (String course : courses) {
            System.out.println("- " + course);
        }

    }
}