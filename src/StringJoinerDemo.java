import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joiner=new StringJoiner(", ", "[", "]");
        joiner.add("Java").add("Spring").add("Quarkus");
        System.out.println(joiner);
    }
}