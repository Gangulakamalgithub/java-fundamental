package Exceptions;

import java.util.Scanner;

public class ExceptionTest {
    static String username;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int num2 = scanner.nextInt();
        try {
            int num3 = num1 / num2;
            System.out.println("Result : " + num3);
            int[] ids = {1,2,3};
            System.out.println(ids[4]);

            System.out.println(username.equals("kamalakar"));
        }catch(ArithmeticException X){
            System.out.println("number should not be zero");
            System.out.println("please enter a input again !");
            input();
        }catch(ArrayIndexOutOfBoundsException Y){
            System.out.println("array index should be between 0-2");

        }catch(NullPointerException e){
            System.out.println("userName should not be null");
        }catch(Exception e){
            System.out.println("Some internal error occurred please tye again ");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }



        System.out.println("hello world");
    }

    private static void input() {
        System.out.println("input goes here");
    }
}
