package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassList;
import Model.Core.Student;
import View.ViewClass;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<Student>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs) {
        if (studs.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {

        // MVP
        students = model.getStudents();

        if (testData(students)) {
            view.printAllStudent(students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        // MVC
        // view.printAllStudent(model.getStudents());
    }

    /*
     * добавлены команды в метоl run
     */
    public void run() {
        Command com = Command.NONE;
        boolean getNewIter = true;
        Scanner scanner = new Scanner(System.in);
        while (getNewIter) {
            view.display("Enter Command: ADD, DELETE, EXIT");
            // String command = scanner.next();
            String command = view.prompt("Enter Command: ADD, DELETE, EXIT");
            com = Command.valueOf(command.toUpperCase());

            switch (com) {
                case ADD:
                    /*
                     * запрос данных о студенте
                     */
                    command = view.prompt("Enter student id");
                    long id = scanner.nextLong();
                    command = view.prompt("Enter student name");
                    String name = scanner.next();
                    Student student = new Student(name, 0);
                    model.addStudent(id, student);
                    view.prompt("Student added");
                    break;
                case DELETE:
                    view.prompt("Enter student id to delete");
                    long idToDelete = scanner.nextLong();
                    model.deleteStudent(idToDelete);
                case EXIT:
                    getNewIter = false;
                    System.out.println("Exit ");
                    scanner.close();
                    return;
                case LIST:
                    view.printAllStudent(model.getStudents());
                    break;
            }
        }
    }

}