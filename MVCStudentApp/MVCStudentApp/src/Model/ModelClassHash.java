package Model;

import Controller.Interfaces.iGetView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.Core.Student;
/*
 * Класс - модель с применением HashMap для хранения информации о студентах
 */

public class ModelClassHash implements iGetView {

    private Map<Long, Student> studentMap;

    /*
     * Конструктор инициализирует хэш-таблицу для хранения данных о студентах
     */
    public ModelClassHash() {
        this.studentMap = new HashMap<>(5, 1);
    }

    @Override
    public void addStudent(long id, Student student) {
        studentMap.put(id, student);
    }

    @Override
    public void deleteStudent(long id) {
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
        } else {
            System.out.println("Student with " + id + "does not exist");
        }
    }

    @Override
    public void display(String s) {

    }

    @Override
    public void printAllStudent(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printAllStudent'");
    }

    @Override
    public String prompt(String msg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prompt'");
    }
}