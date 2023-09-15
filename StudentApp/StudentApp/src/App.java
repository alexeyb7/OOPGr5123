import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        // создали группу 4580
        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for (Student std : group4580) {
            System.out.println(std);
        }
        // создание новых студентов
        Student s7 = new Student("Зезик", 21);
        Student s8 = new Student("Гарри", 28);
        Student s9 = new Student("Рауль", 22);
        Student s10 = new Student("Света", 21);
        Student s11 = new Student("Ира", 18);
        Student s12 = new Student("Лена", 19);
        // создание нового списка студентов
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);
        // создание новой группы 4581
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);
        System.out.println(group4581);
        for (Student std : group4581) {
            System.out.println(std);
        }

        List<StudentGroup> studentGroupList = new ArrayList<StudentGroup>(); // создание списка групп

        studentGroupList.add(group4580);
        studentGroupList.add(group4581);

        StudentSteam steam1 = new StudentSteam(studentGroupList, 1);// создание потока студентов

        for (StudentGroup group : steam1) {
            System.out.println(group);
            for (Student stud : group) {
                System.out.println(stud);
            }
        }
        System.out.println("=========================================================");

        Collections.sort(steam1.getListGroups());
        System.out.println(steam1); // вывод потока в консоль

        // Collections.sort(group4580.getGroup());

        // for (Student std : group4580.getGroup()) {
        // System.out.println(std);
        // }
    }
}
