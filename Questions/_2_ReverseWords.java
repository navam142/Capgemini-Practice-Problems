package Questions;

public class _2_ReverseWords {
    public static void main(String[] args) {
        String sample = "I am Navam Sharma";
        String[] arr = sample.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : arr) {
            result.append(new StringBuilder(word).reverse().toString());
            result.append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
