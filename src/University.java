public class University {
    private String name;
    private Student[] students;
    private Teacher[] teachers;
    private int studentCount;
    private int teacherCount;
    final int MAX_STUDENTS = 100;
    final int MAX_TEACHERS = 50;

    public University(String name) {
        this.name = name;
        this.students = new Student[MAX_STUDENTS];
        this.teachers = new Teacher[MAX_TEACHERS];
    }

    public void admitStudent(Student student) {
        students[studentCount] = student;
        studentCount++;
        System.out.println("Student: " + student.getFullName() + " successfully admitted");
        if (studentCount > MAX_STUDENTS) {
            System.out.println("Student limit reached");
        }
    }

    public void hireTeacher(Teacher teacher) {
        teachers[teacherCount] = teacher;
        teacherCount++;
        System.out.println("Teacher: " + teacher.getFullName() + " successfully hired");
        if (teacherCount > MAX_TEACHERS) {
            System.out.println("Teacher limit reached");
        }
    }

    public void getStudentList() {
        System.out.println("\t\n=====List of Students=====");
        for (Student student : students) {
            if (student != null) {
                System.out.println("- " + student.getFullName());
            }
        }
    }

    public void displayUniversityStats() {
        System.out.println("\t\n=====About " + name + " =====");
        System.out.println("Number of student: " + studentCount);
        System.out.println("Number of teachers: " + teacherCount);
    }

}