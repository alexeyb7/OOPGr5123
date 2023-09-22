package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

public class ViewClassEn implements iGetView {

    @Override
    public void addStudent(long id, Student student) {

    }
    /*
     * public void printAllStudent(List<Student> students) {
     * System.out.println("----------- Список студентов -----------");
     * for (Student s : students) {
     * System.out.println(s);
     * }
     * System.out.println("----------------------------------------");
     * }
     * 
     * public String prompt(String msg) {
     * Scanner in = new Scanner(System.in);
     * System.out.println(msg);
     * return in.nextLine();
     * }
     */

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

    @Override
    public void deleteStudent(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }

    @Override
    public void display(String s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
}
