package Java8feature;

public class main4 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greet();
        greeting.greet("Hello ! How are you");


        /*
        1.anonymous inner class
        2.object to the inner class
         */

        Greet greet = new Greet() {
            @Override
            public void greet() {
                System.out.println("Greet");
            }

            @Override
            public void greet(String msg) {
                System.out.println("Greet(String)");
            }
        };

        greet.greet();
        greet.greet("Hello");

        //threading
        //Runnable -> run
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        //lambda expression
        //is implementation of functional interfaces (instance of the functional interfaces)
        /*
        Hello hello = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Hey, How Are You !");
            }
        };*/

        Hello hello = (helloMsg) -> System.out.println(helloMsg);
        hello.sayHello("Hey, How Are You !");

    }
}
