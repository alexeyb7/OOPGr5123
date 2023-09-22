package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

public class ViewClassEn implements iGetView {
    /*
     * метод добавления студента
     */
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
        return;
    }

    @Override
    public String prompt(String msg) {
        return " ";
    }

    /*
     * метод удаление студента по id
     */
    @Override
    public void deleteStudent(long id) {
        return;
    }

    /**
     * метод отображения текста на англ. языке
     */
    @Override
    public void display(String s) {
        System.out.println("English view:" + s);
        ;
    }
}
