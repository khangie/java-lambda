package io.javabrains.main;

import io.javabrains.model.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 45),
                new Person("Charlotte", "Bronte", 51),
                new Person("Matthew", "Arnold", 39)
        );

        // Stream is like an assembly line
        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));
    }
}
