package com.example.dto;

/**
 * Created by mrpehlivan on 26/04/2017.
 *
 * Employee
 */
public class Employee {

    private int id;
    private String department;
    private String name;
    private String surname;
    private String address;
    private double salary;
    private boolean active;
    private boolean blocked;

    public Employee(int id, String department, String name, String surname, String address, double salary, boolean active, boolean blocked) {
        this.id = id;
        this.department = department;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.salary = salary;
        this.active = active;
        this.blocked = blocked;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", active=" + active +
                ", blocked=" + blocked +
                '}';
    }
}
