package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.PersonComparator;

import Domain.Teacher;

/*
 * класс для работы с преподавателями
 */
public class TeacherService implements iPersonService<Teacher> {

    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /*
     * добавление преподавателей
     */
    @Override
    public void create(String firstName, int age) {

        Teacher teach = new Teacher(firstName, age, "teacher");
        count++;
        teachers.add(teach);
    }

    /*
     * метод сортировки преподавателей по ФИО
     */
    public void sortByFIO() {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }
}
