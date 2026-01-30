package linearandbinarysearch.stringbuffer;

public class ConcatenateStrings {

    public static String concatenate(String[] str) {
        StringBuffer sb = new StringBuffer();
        for (String word : str) {
            sb.append(word).append(" ");
        }
        return sb.toString().strip();
    }

    public static void main(String[] args) {
        String[] arr = {"I", "am", "Navam", "Sharma"};
        System.out.println(concatenate(arr));
    }
}
