package com.example.streams;

import com.example.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by mrpehlivan on 26/04/2017.
 *
 * CollectorsExample
 */
public class CollectorsExample {

    //EXAMPLE 1
    // Collect names into a List
    public List<String> employeeNameList(List<Employee> employees){
        return employees.stream().map(Employee::getName).collect(Collectors.toList());
    }

    //EXAMPLE 2
    // Collect names into a Tree Set
    public TreeSet<String> employeeNameTreeSet(List<Employee> employees){
        return  employees.stream().map(Employee::getName).collect(Collectors.toCollection(TreeSet::new));
    }

    //EXAMPLE 3
    // Sum amount all employees
    public double totalAmountOfEmployees(List<Employee> employees){
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

    //EXAMPLE 4
    // Sum amount all employees and groupByDepartment
    public Map<String,Double> totalAmountOfEmployeesByDepartment(List<Employee> employees){
        return  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
    }

    //EXAMPLE 5
    // groupByEmployeesByDepartments
    public Map<String,List<Employee>> groupByEmployeesByDepartments(List<Employee> employees){
        return  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }

    //EXAMPLE 6
    //filter employees by salary that which are larger than 100 by department
    public Map<String,List<Employee>> filterEmployeesByDepartment(List<Employee> employees){
        return  employees.stream().filter(e -> e.getSalary()>Double.parseDouble("100")).collect(Collectors.groupingBy(Employee::getDepartment));
    }

    //EXAMPLE 7
    //Average of salary by department
    public Map<String,Double> averageSalaryByDepartment(List<Employee> employees){
        return  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
    }

    //EXAMPLE 8
    //partition of employees by department1
    public Map<Boolean,List<Employee>> partitionEmployees(List<Employee> employees){
        return  employees.stream().collect(Collectors.partitioningBy(e -> e.getDepartment().equals("Department1")));
    }

    public List<Employee> sortEmployeeByActive(List<Employee> employees){
        return  employees.stream().sorted(Comparator.comparing(Employee::isBlocked)).collect(Collectors.toList());
    }


    public List<Employee> generateEmployeeList(){
        return IntStream.rangeClosed(1,5).mapToObj(i -> new Employee(i,"Department"+i,"Name"+i,"Surname"+i,"Adress"+i, 100*i,true, new Random().nextBoolean())).collect(Collectors.toList());
    }



}
