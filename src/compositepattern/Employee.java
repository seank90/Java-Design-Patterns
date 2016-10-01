package compositepattern;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sean Keane on 29/03/2016.
 */
class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    //constructor
    public Employee(@NotNull String name, @NotNull String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name + ", dept : " + dept
                + ", salary : " + salary + " ]");
    }
}
