package linearandbinarysearch.stringbuilder;

import java.util.stream.Collectors;

public class RemoveDuplicates {

    static String removeDuplicates(String str) {
        return str.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }
    public static void main(String[] args) {
        String name = "Navam Sharma";
        System.out.println(removeDuplicates(name));
    }
}
