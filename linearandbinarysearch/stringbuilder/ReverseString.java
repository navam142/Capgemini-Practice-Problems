package linearandbinarysearch.stringbuilder;

public class ReverseString {

    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "Navam";
        System.out.println(reverseString(s));
    }
}
