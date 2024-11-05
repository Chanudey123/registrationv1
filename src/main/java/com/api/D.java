package com.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class D implements Developer{

    @Override
    public int salary() {
        System.out.println("Python Developer");
        return 40000;
    }
}
