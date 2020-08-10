package io.javabrains.main;

import io.javabrains.model.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 45),
                new Person("Charlotte", "Bronte", 51),
                new Person("Matthew", "Arnold", 39)
        );

        System.out.println("Using for loop");

        // Externally called
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("\nUsing for in loop");

        // Externally called
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("\nUsing lambda for each loop");

        people.forEach(p -> System.out.println(p)); // Internally called and allows for multi-threading (order is not important)

    }

}