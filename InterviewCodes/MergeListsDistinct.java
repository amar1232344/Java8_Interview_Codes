import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListsDistinct {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("java", "spring", "kafka", "docker");
        List<String> list2 = Arrays.asList("quarkus", "spring", "java", "oracle");
        List<String> mergedDistinct = Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Merged & Distinct : " + mergedDistinct);
        // Output: [java, spring, kafka, docker, quarkus, oracle]

    }
}
