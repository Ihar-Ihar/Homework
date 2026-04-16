import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Set<Student> students = new HashSet<>();
        students.add(new Student("Иванов Иван Иванович", 12, 1, new double[]{3.5, 4.0, 5.0}));
        students.add(new Student("Сидоров Игорь Игнатович", 12, 2, new double[]{2.5, 3.0, 4.0}));
        students.add(new Student("Юринок Артем Александрович", 12, 2, new double[]{2.0, 2.5, 3.5}));

        System.out.println("Студенты второго курса ");
        StudentManager.printStudents(students, 2);
        System.out.println("Студенты второго курса после перевода");
        StudentManager.promoteStudents(students);
        StudentManager.printStudents(students, 2);
        System.out.println("Студенты второго курса после отчисления");
        StudentManager.removeLowGradeStudents(students);
        StudentManager.printStudents(students, 2);

        System.out.println("Задание 2");
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов Иван Иванович", "123-456-789");
        phoneBook.add("Иванов Иван Иванович", "987-654-321");
        phoneBook.add("Сидоров Игорь Игнатович", "779-455-632");
        phoneBook.add("Юринок Артем Александрович", "555-555-555");

        System.out.println("Телефоны Иванов Иван Иванович: " + phoneBook.get("Иванов Иван Иванович"));
        System.out.println("Телефоны Сидоров Игорь Игнатович: " + phoneBook.get("Сидоров Игорь Игнатович"));
        System.out.println("Телефоны Юринок Артем Александрович: " + phoneBook.get("Юринок Артем Александрович"));
    }
}
