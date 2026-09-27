import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(
                new Developer("Ali", 100000, 20000)
        );

        employees.add(
                new SalesManager("Ahmed", 80000, 500000, 0.05)
        );

        employees.add(
                new Developer("Sara", 120000, 25000)
        );

        employees.add(
                new SalesManager("Usman", 90000, 600000, 0.04)
        );

        for (Employee employee : employees) {

            System.out.println(
                    employee.getName()
                    + " final pay: "
                    + employee.calculatePay()
            );
        }
    }
}