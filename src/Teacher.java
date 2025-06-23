import java.util.Arrays;

public class Teacher extends Person {
    private String teacherID;
    private String department;
    private String[] coursesTaught;
    private final int MAX_COURSES;

    public Teacher(
            String fullName,
            int age,
            String gender,
            String teacherID,
            String department,
            String[] coursesTaught) {

        super(fullName, age, gender);

        this.teacherID = teacherID;
        this.department = department;
        this.coursesTaught = coursesTaught;
        MAX_COURSES = 3;
    }


    public void assignCourse(String courseName) {
        coursesTaught = Arrays.copyOf(coursesTaught, coursesTaught.length + 1);
        coursesTaught[coursesTaught.length - 1] = courseName;
        System.out.println("Course " + courseName + " successfully added");
        if (coursesTaught.length >= MAX_COURSES) {
            System.out.println("Course limit reached");
        }
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\t\n=====Additional information=====");
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Department: " + department);
        System.out.println("Courses " + "(" + coursesTaught.length + "): ");
        for (String course : coursesTaught) {
            System.out.println("- " + course);
        }
    }
}
