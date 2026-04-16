import java.util.Set;

public class StudentManager {
    public static void removeLowGradeStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public static void printStudents(Set<Student> students, int course) {
        students.stream()
                .filter(student -> student.course == course)
                .forEach(student -> System.out.println(student.name));
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            student.promoteToNextCourse();
        }
    }
}
