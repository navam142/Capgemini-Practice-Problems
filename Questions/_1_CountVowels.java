package Questions;

public class _1_CountVowels {
    public static void main(String[] args) {
        String sample = "I am Navam";
        int vowelCount = 0;
        for (char ch : sample.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
