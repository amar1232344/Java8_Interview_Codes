import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Amit", "Priya", "Neha", "Rohit", "Anitha");
        Predicate<String> startWithA = name -> name.startsWith("A"); //Predicate-> filter names starting with "A"
        Function<String, String> toUpper = String::toUpperCase;     // Function → convert to uppercase
        Consumer<String> print = System.out::println; //Consumer ->Print each case
        Supplier<String> noNames = () -> "No Names found!"; //Supplier -> provide default value
        names.stream()
                .filter(startWithA)
                .map(toUpper)
                .findFirst()
                .ifPresentOrElse(prints -> System.out.println(prints), //consumer
                        () -> System.out.println(noNames.get())); // Runnable → prints supplier value
    }
}
