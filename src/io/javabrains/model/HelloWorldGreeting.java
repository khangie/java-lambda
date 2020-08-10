package io.javabrains.model;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello world");
    }
}
