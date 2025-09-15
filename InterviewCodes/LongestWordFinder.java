import java.util.Arrays;

public class LongestWordFinder {
    public static void main(String[] args) {
        String sentence = "Java stream API makes coding elegant and powerful";

        String longestWord = Arrays.stream(sentence.split("\\s+")) // split by space
                .reduce((word1, word2) -> word1.length() >= word2.length() ? word1 : word2)
                .orElse("");
        System.out.println("Longest Word: " + longestWord); // Output: powerful

    }
}
