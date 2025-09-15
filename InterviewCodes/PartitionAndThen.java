import java.util.*;
import java.util.stream.Collectors;

public class PartitionAndThen {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Priya", "Anitha", "Rohit", "Arjun");

        // partitioningBy → split into true/false groups
        Map<Boolean, List<String>> partitioned = names.stream()
                .collect(Collectors.partitioningBy(n -> n.startsWith("A")));
        System.out.println(partitioned);

        // collectingAndThen → collect + post-process
        List<String> upper = names.stream().map(String::toUpperCase)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        System.out.println(upper);
    }
}