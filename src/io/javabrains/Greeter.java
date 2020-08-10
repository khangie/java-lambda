package io.javabrains;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();
        helloWorldGreeting.perform();
        greeter.greet(helloWorldGreeting);

        // Anonymous inner class implementation
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello world 1");
            }
        };
        innerClassGreeting.perform();

        // Use an interface that has a function with the same signature of the Lambda function
        Greeting myLambdaFunction = () -> System.out.println("Hello world 2");
        myLambdaFunction.perform(); // The lambda function behaves like an actual implementation of Greeting interface
        greeter.greet(myLambdaFunction);

        // Pass the lambda function directly in
        greeter.greet(() -> System.out.println("Hello world 3"));
    }

}