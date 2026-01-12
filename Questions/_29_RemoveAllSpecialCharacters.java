package Questions;

public class _29_RemoveAllSpecialCharacters {

    static String helper(String s) {
        StringBuilder result = new StringBuilder();
        for (String word : s.split(" ")) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                if (Character.isAlphabetic( ch) || Character.isDigit(ch)) {
                    sb.append(ch);
                }
            }
            result.append(sb);
            result.append(" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String s = "This $tring has $pecia) ch@r@ct#rs";
        System.out.println("string without special characters: " + helper(s));
        
    }
}
