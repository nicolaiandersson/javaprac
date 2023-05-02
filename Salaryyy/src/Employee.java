import java.util.ArrayList;
import java.util.Collections;

public class Employee {
    private String name;
    private int salary;
    private int taxPercentage;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.taxPercentage = 35;
    }


    public int calculatePayment() {
        int taxAmount = (salary * taxPercentage) / 100;
        return salary - taxAmount;
    }


    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee e = new Employee("Karl",35000);
        Employee e2 = new Employee("Bob",20000);
        Employee e3 = new Employee("Niels",50000);

        Collections.addAll(employees, e,e2,e3);

        for(Employee b : employees) {
            System.out.println("Name: " + b.name + ", Salary after tax: " + b.calculatePayment());
        }


    }
}
