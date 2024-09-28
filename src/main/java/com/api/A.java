package com.api;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "chanu"),
                new Employee(2, "chandru"),
                new Employee(3, "bunu")
        );
        List<EmployeeDto> collect = list.stream().map(e -> mapToDto(e)).collect(Collectors.toList());
    }
    static EmployeeDto mapToDto(Employee employee){
        EmployeeDto dto=new EmployeeDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        return dto;
    }
}
