package com.Exam.Employee;

import java.util.Objects;

public class EmployeeSalaryFilter {

    public Integer id;
    public String name;
    public Integer salary;
    public String dept;

    public EmployeeSalaryFilter() {
    }

    public EmployeeSalaryFilter(Integer id, String name, Integer salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return this.salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public EmployeeSalaryFilter id(Integer id) {
        setId(id);
        return this;
    }

    public EmployeeSalaryFilter name(String name) {
        setName(name);
        return this;
    }

    public EmployeeSalaryFilter salary(Integer salary) {
        setSalary(salary);
        return this;
    }

    public EmployeeSalaryFilter dept(String dept) {
        setDept(dept);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeSalaryFilter)) {
            return false;
        }
        EmployeeSalaryFilter employeeSalaryFilter = (EmployeeSalaryFilter) o;
        return Objects.equals(id, employeeSalaryFilter.id) && Objects.equals(name, employeeSalaryFilter.name)
                && Objects.equals(salary, employeeSalaryFilter.salary)
                && Objects.equals(dept, employeeSalaryFilter.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, dept);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", salary='" + getSalary() + "'" +
                ", dept='" + getDept() + "'" +
                "}";
    }

}
