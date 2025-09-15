import java.util.List;
import java.util.stream.Collectors;

public class StartEndSameChar {
    public static void main(String[] args) {
        String sentence="apple anna civic banana level";

        List<String>result= Arrays.stream(sentence.split("\\s+"))
                .filter(word->word.charAt(0)== word.charAt(word.length()-1))
                .collect(Collectors.toList());
        System.out.println("Words starting and ending with same character " +result);
    }
}
