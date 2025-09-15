import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PairsWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 78, 1};
        int target = 7;
        List<String> pairs = IntStream.range(0, arr.length)
                .boxed()
                .flatMap(i ->
                        IntStream.range(i + 1, arr.length)
                                .filter(j -> arr[i] + arr[j] == target)
                                .mapToObj(j -> "(" + arr[i] + ", " + arr[j] + ")")

                )
                .collect(Collectors.toList());
        System.out.println("Pairs with Sum " + target + " : " +pairs);
    }
}
