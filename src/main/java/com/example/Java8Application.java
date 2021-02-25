package com.example;

import com.example.dto.Employee;
import com.example.streams.CollectorsExample;
import com.example.streams.IntegerStreamExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class Java8Application {

    static final List<Employee> employees = IntStream.rangeClosed(1, 5)
			.mapToObj(i -> new Employee(i, "Department" + i, "Name" + i, "Surname" + i, "Adress" + i, 100 * i, true, new Random().nextBoolean()))
			.collect(Collectors.toList());

    public static void main(String[] args) {
        SpringApplication.run(Java8Application.class, args);

        {
            //To initialize CollectorsExample class
            CollectorsExample collectorsExample = new CollectorsExample();

            System.out.println("------------------------------START OF COLLECTOR EXAMPLE----------------------------------");

            //employeeNameList
            System.out.println();
            collectorsExample.employeeNameList(employees).forEach(k -> System.out.println("Name ArrayList : " + k));
            System.out.println("------------------------------------------------------------------------------------------");

            //employeeNameSet
            collectorsExample.employeeNameTreeSet(employees).forEach(k -> System.out.println("Name TreeSet : " + k));
            System.out.println("------------------------------------------------------------------------------------------");

            //totalAmount
            System.out.println("Total Amount of Employees : " + collectorsExample.totalAmountOfEmployees(employees));
            System.out.println("------------------------------------------------------------------------------------------");

            //totalAmountByDepartment
            collectorsExample.totalAmountOfEmployeesByDepartment(employees).forEach((k, v) -> System.out.println("Department : " + k + " Salary Sum : " + v));
            System.out.println("------------------------------------------------------------------------------------------");

            //employeesByDepartment
            collectorsExample.groupByEmployeesByDepartments(employees).forEach((k, v) -> System.out.println(k + " : " + v));
            System.out.println("------------------------------------------------------------------------------------------");

            //filterEmployeeSalary larger than 100
            collectorsExample.filterEmployeesByDepartment(employees).forEach((k, v) -> System.out.println(k + " : " + v));
            System.out.println("------------------------------------------------------------------------------------------");

            //average salary by departmens
            collectorsExample.averageSalaryByDepartment(employees).forEach((k, v) -> System.out.println(k + " : " + v));
            System.out.println("------------------------------------------------------------------------------------------");

            //partition of employees by department1
            collectorsExample.partitionEmployees(employees).forEach((k, v) -> System.out.println(k + " : " + v));
            System.out.println("------------------------------END OF COLLECTOR EXAMPLE----------------------------------");

            //active
            System.out.println();
            collectorsExample.sortEmployeeByActive(employees).forEach(k -> System.out.println("Active : " + k));
            System.out.println("------------------------------------------------------------------------------------------");
        }
        System.out.println();
        {
            System.out.println("------------------------------START OF INTSTREAM EXAMPLE----------------------------------");

            //To initialize IntegerStreamExample class
            IntegerStreamExample integerStreamExample = new IntegerStreamExample();

            integerStreamExample.rangeAndFindSquareOfNumbersExample(1, 8).forEach(System.out::println);
            System.out.println("------------------------------------------------------------------------------------------");

            integerStreamExample.rangeClosedAndFindSquareOfNumbersExample(1, 8).forEach(System.out::println);
            System.out.println("------------------------------------------------------------------------------------------");

            System.out.println(integerStreamExample.concatNumbersExample(1, 1).count());
            System.out.println("------------------------------------------------------------------------------------------");

            integerStreamExample.iterateNumbersByOperationAddExample(0, 10).forEach(i -> System.out.println("i : " + i));
            System.out.println("------------------------------------------------------------------------------------------");

            System.out.println("AnyMatch Example:" + integerStreamExample.anyMatchNumbersExample(0, 10));
            System.out.println("------------------------------------------------------------------------------------------");

            System.out.println("AllMatch Example:" + integerStreamExample.allMatchNumbersExample(0, 10));
            System.out.println("------------------------------------------------------------------------------------------");

            System.out.println("NoneMatch Example:" + integerStreamExample.noneMatchNumbersExample(0, 10));
            System.out.println("------------------------------------------------------------------------------------------");

            System.out.println("Max Number:" + integerStreamExample.maxNumberExample(0, 10));
            System.out.println("------------------------------------------------------------------------------------------");

            System.out.println("Min Number:" + integerStreamExample.minNumberExample(0, 10));
            System.out.println("------------------------------------------------------------------------------------------");

            System.out.println("Sum of Numbers:" + integerStreamExample.sumNumberExample(0, 10));
            System.out.println("------------------------------------------------------------------------------------------");

            System.out.println("Average of Numbers:" + integerStreamExample.averageOfNumbersExample(0, 10));
            System.out.println("------------------------------END OF INTSTREAM EXAMPLE----------------------------------");

        }


    }
}
