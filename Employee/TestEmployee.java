package com.Exam.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {

        List<EmployeeSalaryFilter> emp = new ArrayList<>(
                Arrays.asList(new EmployeeSalaryFilter(1, "shameer", 10000, "computer")));
        emp.add(new EmployeeSalaryFilter(2, "smr", 20000, "computer"));
        emp.add(new EmployeeSalaryFilter(3, "smr001", 30000, "chemistry"));
        emp.add(new EmployeeSalaryFilter(4, "smr002", 60000, "maths"));
        // Filter out employees whose salary is less than 50,000.
        List<EmployeeSalaryFilter> salry = emp.stream().filter((item) -> item.salary < 50000)
                .collect(Collectors.toList());

        // System.out.println(salry);

        // Group the remaining employees by their department.
        Map<String, List<EmployeeSalaryFilter>> grouping = emp.stream()
                .filter((emp1) -> emp1.salary < 50000)
                .collect(Collectors.groupingBy(EmployeeSalaryFilter::getDept));
        System.out.println(grouping);

    }
}
