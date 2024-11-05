package com.api;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.*;

public class A {
    public static void main(String[] args) {
        Developer javaDeveloper = DeveloperFactory.getDetails("Java Developer");
        int salary = javaDeveloper.salary();
        System.out.println(salary);
    }
}
