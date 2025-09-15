import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperatorsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Priya", "Neha", "Rohit", "Anitha");

        //Intermediate Operatations-> filter +map
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A")) //Intermediate->filter only- "A"
                .map(String::toUpperCase)            //Intermediate Convert to Uppercase
                .collect(Collectors.toList());     // Terminal ->collect into list

        System.out.println("Result : " + result);
        //Another terminal operator example:count
        long count = names.stream()
                .filter(name -> name.length() > 4) //Intermediate
                .count();     // Terminal
        System.out.println("Count of names with length >4: " + count);

    }
}
