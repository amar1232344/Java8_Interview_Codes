import java.util.stream.Collectors;

public class UniqueCharacters {
    public static void main(String[] args) {
        String input="stream";

        boolean allUnique=input.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.toSet())
                .size()==input.length();
        System.out.println("Has all Unique characters? : " +allUnique);

    }
}
