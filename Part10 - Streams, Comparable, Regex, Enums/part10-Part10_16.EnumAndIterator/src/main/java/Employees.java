import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextEmployee = iterator.next();
            System.out.println(nextEmployee);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextEmployee = iterator.next();
            if (nextEmployee.getEducation() == education) {
                System.out.println(nextEmployee);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextEmployee = iterator.next();
            if (nextEmployee.getEducation() == education) {
                iterator.remove();
            }
        }
    }


}
