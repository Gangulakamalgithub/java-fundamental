package Java8feature;

public class Greeting implements Greet{
    @Override
    public void greet() {
        System.out.println("Hello My Name Is Kamal");
    }

    @Override
    public void greet(String msg) {
        System.out.println(msg);
    }
}
