import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Виведення на екран елементів List: Створити список, заповнити його на 10 елементів
 * та вивести на екран вміст, використовуючи iterator.
 */


public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>() {
            {
                add(new Employee("Dmytro1", 25, "Structural Engineer"));
                add(new Employee("Dmytro2", 30, "Structural Engineer"));
                add(new Employee("Dmytro3", 20, "Structural Engineer"));
                add(new Employee("Dmytro4", 21, "Structural Engineer"));
                add(new Employee("Dmytro5", 48, "Structural Engineer"));
                add(new Employee("Dmytro6", 44, "Structural Engineer"));
                add(new Employee("Dmytro7", 57, "Structural Engineer"));
                add(new Employee("Dmytro8", 18, "Structural Engineer"));
                add(new Employee("Dmytro9", 19, "Structural Engineer"));
                add(new Employee("Dmytro10", 29, "Structural Engineer"));
            }

        };

        Iterator<Employee> listIterator = employeeList.listIterator();
        while (listIterator.hasNext()) {
            Employee employee = listIterator.next();
            System.out.println(employee);

        }

    }
}
