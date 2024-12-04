package com.reliquias.software.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hookExample {

    @Before
    public static void beforeHook(){
        System.out.println("Before Hook");
    }

    @After
    public static void afterHook(){
        System.out.println("After Hook");
    }
}
