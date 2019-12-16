package com.example.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloPrinter implements CommandLineRunner {
    private final NameComputer nameComputer;

    public HelloPrinter(NameComputer nameComputer) {
        this.nameComputer = nameComputer;
    }

    @Override
    public void run(String... args) {
        String message = "Hello " + nameComputer.computeName() + "!";
        System.out.println(message);
    }
}
