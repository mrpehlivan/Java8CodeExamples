package com.example.streams;

import com.example.dto.Employee;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Created by mrpehlivan on 26/04/2017.
 *
 * CollectorsExample
 */
public class CollectorsExample {

    //EXAMPLE 1
    // Accumulate names into a List
    public List<String> employeeNameList(List<Employee> employees){
        //First use list and stream it
        //if you want to do a filter operation you can use .map method
        //and return type will be .collect method
        return employees.stream().map(Employee::getName).collect(Collectors.toList());
    }

    //EXAMPLE 2
    // Accumulate names into a Tree Set
    public TreeSet<String> employeeNameTreeSet(List<Employee> employees){
        //First use list and stream it
        //if you want to do a filter operation you can use .map method
        //and return type will be .collect method
        //and we used that Collectors.toCollection method to extract different type
        return  employees.stream().map(Employee::getName).collect(Collectors.toCollection(TreeSet::new));
    }

    //EXAMPLE 3
    // Sum amount all employess
    public double totalAmountOfEmployees(List<Employee> employees){
        return  employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
    }

    //EXAMPLE 4
    // Sum amount all employess and groupByDepartment
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
        return  employees.stream().filter(e -> e.getSalary()>Double.valueOf("100")).collect(Collectors.groupingBy(Employee::getDepartment));
    }

    //EXAMPLE 7
    //Avarage of salary by department
    public Map<String,Double> avarageSalaryByDepartment(List<Employee> employees){
        return  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
    }

    //EXAMPLE 8
    //partition of employess by department1
    public Map<Boolean,List<Employee>> partitionEmployees(List<Employee> employees){
        return  employees.stream().collect(Collectors.partitioningBy(e -> e.getDepartment().equals("Department1")));
    }


}
