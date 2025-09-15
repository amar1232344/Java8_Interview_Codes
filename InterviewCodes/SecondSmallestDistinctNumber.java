import java.util.Arrays;

public class SecondSmallestDistinctNumber {
    public static void main(String[] args) {
        int[] numbers={10,5,8,20,5,3,10};
        Integer secondSmallest= Arrays.stream(numbers)
                .boxed()  // convert IntStream → Stream<Integer>
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second Smallest Distinct Number: " +secondSmallest);

    }
}
