package Java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        //Predicted

        //find even or odd numbers
        Predicate<Integer>isEvenPredicted = num -> num % 2 == 0;
        System.out.println(isEvenPredicted.test(20));

        //consumer
        //accept(Object)

        List<String> customerNameList = Arrays.asList("kamal","Ravi","Raju");

        //Consumer<String> printNameConsumer = name -> System.out.println(name);
        //customerNameList.forEach(printNameConsumer);

        //using lambda expressions without method expressions
        customerNameList.forEach(name -> System.out.println(name));

        //using lambda expression with method expressions
        customerNameList.forEach(System.out::println);

        Function<String,String> upperCaseFunction = name -> {
            name = name.toUpperCase();
            return name;
        };

        customerNameList.forEach(name ->System.out.println(upperCaseFunction.apply(name)));
        for(String name : customerNameList){
            System.out.println(name);
        }




    }
}
