import java.util.*;
import java.util.stream.Collectors;

public class Student {

    public static void main(String[] args) {

        // Creating a HashMap
        Map<String, String> studMap = new HashMap<>();

        // Adding student with key-value pairs to a HashMap
        studMap.put("James","C");
        studMap.put("Carol","D");
        studMap.put("Michael","B");
        studMap.put("Anna","A");

        studMap.forEach((key, value) -> System.out.println(key + " : " + value));

        //Removing student from HashMap
        String  removedStud = "Carol";
        String removeStudent = studMap.remove(removedStud);
        System.out.println("After Removing student");
        studMap.forEach((key, value) -> System.out.println(key + " : " + value));

        //Sorting student by value
        Map<String, String> result2 = new LinkedHashMap<>();
        studMap.entrySet().stream()
                .sorted(Map.Entry.<String, String>comparingByValue())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

        System.out.println("Sorted Student by Grade:");
        //List all Student
        result2.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
