package Model;

import java.util.List;

import Model.Core.Student;

public class ModelClassList {

    private List<Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}