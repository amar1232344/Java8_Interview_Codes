import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByFirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banna", "apricot", "blueberry", "cherry", "avocado");
        // Group By first letter
        Map<Character, List<String>> grouped =
                words.stream()
                        .collect(Collectors.groupingBy(w -> w.charAt(0)));

        //Print Using Method reference
        grouped.forEach(GroupWordsByFirstLetter::printGroup);

    }

    private static void printGroup(Character ch, List<String> list) {
        System.out.println(ch + "-> " + String.join(", ", list));
    }

}
