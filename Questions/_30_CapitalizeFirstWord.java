package Questions;

public class _30_CapitalizeFirstWord {

    static String captialize(String s) {
        StringBuilder result = new StringBuilder();
        for (String word : s.split(" ")) {
            StringBuilder sb = new StringBuilder(word);
            sb.setCharAt(0, Character.toUpperCase(word.charAt(0)));
            sb.append(" ");
            result.append(sb);
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String s = "one day i will make it to the end";
        System.out.println("result: " + captialize(s));
    }
}
