package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Company company = new Company(1, "Workintech", 100000.0, new String[5]);

        Employee employee = new Employee(1, "Cansu Cebesoy", "cansu@example.com", "cansu123", new String[3]);


        Healthplan healthplan = new Healthplan(1, "Basic Plan", Plan.BASIC);


        System.out.println(company);
        System.out.println(employee);
        System.out.println(healthplan);


        employee.addHealthPlan(0, "Plan 1");
        employee.addHealthPlan(1, "Plan 2");
        employee.addHealthPlan(0, "Plan 3");


        company.addEmployee(0, "Cansu");
        company.addEmployee(5, "Sude");
}
}