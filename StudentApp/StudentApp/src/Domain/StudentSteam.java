package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * класс потока студентов
 * 
 */
public class StudentSteam implements Iterable<StudentGroup> {
    // список учебных групп
    private List<StudentGroup> listGr;
    private Integer idSteam;

    // конструктор принимает список групп и идентификатор потока
    public StudentSteam(List<StudentGroup> listGr, Integer idSteam) {
        this.listGr = listGr;
        this.idSteam = idSteam;
    }

    /*
     * Перегрузка метода toString
     * для вывода номера потока, кол-ва групп и списка студентов с номером группы
     */
    public String toString() {
        return "Поток: " + idSteam + " Кол-во групп:" + listGr.size() + listGr;
    }

    public List<StudentGroup> getListGroups() {
        return listGr;
    }

    /*
     * метод вывода на экран каЖдой группы из потока студентов StudentSteam
     */
    public void printing(StudentSteam steam) {
        for (StudentGroup group : steam.getListGroups()) {
            System.out.println();
            System.out.println("Группа " + group.getIdGroup() + "Студентов в группе " + group.getLength());
            for (int i = 0; i < group.getGroup().size(); i++) {
                System.out.println(group.getStudent(i));
            }
        }
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }

}
