package Java8feature;

//Functional interface is used for simplifying anonymous inner classes especially functional programming
@FunctionalInterface
public interface Hello {

    void sayHello(String helloMsg); //single abstract method (SAM)
}
