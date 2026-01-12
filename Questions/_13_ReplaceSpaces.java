package Questions;

public class _13_ReplaceSpaces {
    public static void main(String[] args) {
        String s = "I am Navam Sharma";
        String result = String.join(",", s.split("\\s++"));
        System.out.println(result);
    }
}
