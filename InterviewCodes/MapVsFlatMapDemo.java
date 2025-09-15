import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMapDemo {
    public static void main(String[] args) {
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Amit", "Anitha"),
                Arrays.asList("Rohit", "Riya"),
                Arrays.asList("Neha", "Nilesh")
        );
        //Using map()-> Stream<Stream<String>>
        List<Stream<String>> mapResult = namesNested.stream()
                .map(List::stream) //each inner list converted to stream
                .collect(Collectors.toList());
        System.out.println("map() result size " + mapResult.size());
        // 3 → because 3 inner streams
        System.out.println("map() actual result:");
        mapResult.forEach(s -> System.out.println(s.collect(Collectors.toList())));
        //Using flatmap()-> Stream<String>
        List<String> flatMapResult = namesNested.stream()
                .flatMap(List::stream) // flatten all inner streams into one
                .collect(Collectors.toList());
        System.out.println("\nflatMap() result size: " + flatMapResult.size());
        // 6 → all names merged
        System.out.println("flatMap() actual result:");
        System.out.println(flatMapResult);

    }
}
