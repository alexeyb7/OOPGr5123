package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

public interface iGetModel {
    public List<Student> getStudents();

    void addStudent(long id, Student student);

    void deleteStudent(long id);
}