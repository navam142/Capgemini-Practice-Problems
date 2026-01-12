package Questions;

public class _28_DisplayAsii {
    public static void main(String[] args) {
        String s = "This is a string";
        for (char ch : s.toCharArray()) {
            System.out.println(ch + " -> " + (int) ch);
        }
    }
}
