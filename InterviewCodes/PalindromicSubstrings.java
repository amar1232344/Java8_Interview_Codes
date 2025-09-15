import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String input="level";
        List<String>palindromes= IntStream.range(0,input.length())
                .boxed()
                .flatMap(i->IntStream.rangeClosed(i+1,input.length())
                        .mapToObj(j->input.substring(i,j)))

                .filter(s->s.equals(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println("Palindromic substring " +palindromes);
    }
}
