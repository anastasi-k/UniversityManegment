public class Test {
    public static void main(String[] args) {

        University uni = new University("EUSPb");

        Student student1 = new Student("Anna",
                23,
                "female",
                "123234",
                4.7,
                new String[]{"Math","Sociology", "English", });

        uni.admitStudent(student1);
        student1.enrollCourse("Philosophy");
        student1.displayInfo();
        System.out.println();

        Student student2 = new Student("Richard",
                22,
                "male",
                "111234",
                4.3,
                new String[]{});

        uni.admitStudent(student2);
        student2.enrollCourse("Sociology");
        student2.displayInfo();
        System.out.println();

        Teacher teacher1 = new Teacher("Dr.Colman",
                45,
                "female",
                "T56",
                "Sociology",
                new String[]{"Sociology", "Statistics", });

        uni.hireTeacher(teacher1);
        teacher1.assignCourse("History of sociology");
        teacher1.displayInfo();
        System.out.println();

        Teacher teacher2 = new Teacher("Dr.Senton",
                50,
                "male",
                "T24",
                "Philosophy",
                new String[]{"Ancient philosophy", "Logic", });

        uni.hireTeacher(teacher2);
        teacher2.assignCourse("Middle age philosophy");
        teacher2.displayInfo();

        uni.displayUniversityStats();
        uni.getStudentList();
    }
}
