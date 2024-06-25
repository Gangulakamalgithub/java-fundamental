package Futures.encapsulation.p1;

public class A {

    public int x = 100;

    private int y = 200;

    protected int value = 2000;

    int z = 300;
    public static void main(String[] args) {
        A a;
        a = new A();
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(a.z);
        System.out.println(a.value);
    }
}
