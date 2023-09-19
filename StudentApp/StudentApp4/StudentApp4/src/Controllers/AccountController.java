package Controllers;

import java.util.List;

import Domain.Person;
import Domain.Teacher;

public class AccountController {

    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    /*
     * метод подсчета среднего возраста по списку
     * 
     * @param <T> generic для класса person
     * 
     * @param persons список, по нему вычисляем средний возраст
     * 
     * @return средний возраст списка
     */
    public static <T extends Person> double averageAge(List<T> persons) {
        double sum = 0;
        for (T pers : persons) {
            sum += pers.getAge();
        }
        return sum / persons.size();
    }
}
