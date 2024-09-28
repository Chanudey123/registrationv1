package com.api;

import io.micrometer.observation.Observation;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class B {
    public static void main(String[] args) {
        List<Integer> list = asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect);
    }
}
