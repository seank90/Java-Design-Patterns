package compositepattern;

/**
 * Created by Sean Keane on 29/03/2016.
 */
public class CompositePattern {

    public void run() {

        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerkOne = new Employee("Laura", "Marketing", 10000);
        Employee clerkTwo = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutiveOne = new Employee("Richard", "Sales", 10000);
        Employee salesExecutiveTwo = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutiveOne);
        headSales.add(salesExecutiveTwo);

        headMarketing.add(clerkOne);
        headMarketing.add(clerkTwo);

        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }

}
