package Model;

import Controller.Interfaces.iGetView;

import java.util.HashMap;
import java.util.Map;

import Model.Core.Student;

public class ModelClassHash implements iGetView {

    private Map<Long, Student> studentMap;

    public ModelClassHash() {
        this.studentMap = new HashMap<>(0, 0);
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
}