import java.util.HashMap;
import java.util.Map;

public class MapImprovementsJava8 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Amit", 90);
        scores.put("Priya", 85);
        //1.forEach()-> clean iteration
        scores.forEach((k,v)->System.out.println(k+" scored "+v));

        //2.getOrDefault()->Avoid null check
        System.out.println("Neha's Score "+scores.getOrDefault("Neha",0));

        //3.putIfAbsent()-> add if key not already Present
        scores.putIfAbsent("Neha",75);

        //4.computeIfAbsent()-> compute value if not present
        scores.computeIfAbsent("Rohit",k->80);

        //5.computeIfPresent()-> compute value if present
        scores.computeIfPresent("Priya",(k,v)->v+5);

        //6.merge()->combine value
        scores.merge("Amit",10,Integer::sum);

        System.out.println("Final Scores: " + scores);
    }
}
