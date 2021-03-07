package com.example.streams;

import com.example.dto.Employee;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mrpehlivan on 06/03/2021.
 * StringManipulationExample
 */
public class StringManipulationExample {

    //EXAMPLE 1
    // charAt
    public void printCharAtOfRequestedPositionInEmployeeName(List<Employee> employees, int request) {
        employees.forEach(i -> System.out.format("%s chart at %d is %s \n", i.getName(), request, i.getName().indexOf(request)));

    }

    //EXAMPLE 2
    // indexOf
    public void printIndexOfRequestedStringInEmployeeName(List<Employee> employees, String request) {
        employees.forEach(i -> System.out.format("%s index of %s is %s \n", i.getName(), request, i.getName().indexOf(request)));

    }

    //EXAMPLE 3
    // lastIndexOf
    public void printLastIndexOfRequestedStringInEmployeeName(List<Employee> employees, String request) {
        employees.forEach(i -> System.out.format("%s last index of %s is %s \n", i.getName(), request, i.getName().lastIndexOf(request)));

    }

    //EXAMPLE 4
    // length
    public void printLengthOfEmployeeNames(List<Employee> employees) {
        employees.forEach(i -> System.out.format("%s length is %s \n", i.getName(), i.getName().length()));

    }

    //EXAMPLE 5
    // contains
    public void printContainOfRequestedStringInEmployeeName(List<Employee> employees, String request) {
        employees.forEach(i -> System.out.format("%s contains %s is %b \n", i.getName(), request, i.getName().contains(request)));
    }

    //EXAMPLE 6
    // endsWith
    public void printEndsWithOfRequestedStringInEmployeeName(List<Employee> employees, String request) {
        employees.forEach(i -> System.out.format("%s endsWith %s is %s \n", i.getName(), request, i.getName().endsWith(request)));

    }

    //EXAMPLE 7
    // subString
    public void printSubStringOfRequestedStringInEmployeeName(List<Employee> employees, int begin, int end) {
        employees.forEach(i -> System.out.format("%s substring begin %d end %d and result %s \n", i.getName(), begin, end, i.getName().substring(begin, end)));

    }

    //EXAMPLE 8
    // replaceFirst
    public void printReplaceFirstOfRequestedStringInEmployeeName(List<Employee> employees, String request) {
        employees.forEach(i -> System.out.format("%s replaceFirst %s is %s \n", i.getName(), request, i.getName().replaceFirst("e", request)));
    }

    //EXAMPLE 9
    // replace
    public void printReplaceOfRequestedStringInEmployeeName(List<Employee> employees, String request) {
        employees.forEach(i -> System.out.format("%s replace %s is %s \n", i.getName(), request, i.getName().replace("a", request)));
    }

    //EXAMPLE 10
    // toUpperCase
    public void printToUpperCaseOfEmployeeNames(List<Employee> employees) {
        employees.forEach(i -> System.out.format("%s toUpperCase is %s \n", i.getName(), i.getName().toUpperCase()));

    }

    //EXAMPLE 11
    // toLowerCase
    public void printToLowerCaseOfEmployeeNames(List<Employee> employees) {
        employees.forEach(i -> System.out.format("%s toLowerCase is %s \n", i.getName(), i.getName().toLowerCase()));

    }

    //EXAMPLE 12
    // toCharArray
    public void printToCapitalCaseOfEmployeeNames(List<Employee> employees) {
        employees.forEach(i -> System.out.format("%s toCapitalLetter is %s \n", i.getName(), this.toCapitalLetter(i.getName())));

    }

    //EXAMPLE 13
    // Join
    public void printToEmployeeNamesWithJoining(List<Employee> employees) {
        System.out.format("Collectors.joining result : %s \n", employees.stream().map(Employee::getName).collect(Collectors.joining(",")));
    }

    public String toCapitalLetter(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }


}
