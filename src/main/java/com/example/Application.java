package com.example;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut
                .build(args)
                .environments("default")
                .classes(Application.class)
                .eagerInitSingletons(true)
                .start();
    }
}
