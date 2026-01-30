package linearandbinarysearch.linearsearch;

import java.util.ArrayList;
import java.util.List;

public class SearchWord {

    public static String[] searchWord(List<String[]> listOfSentences, String target) {
        for (String[] arr : listOfSentences) {
            for (String word : arr) {
                if (word.equals(target)) {
                    return arr;
                }
            }
        }
        return new String[]{};
    }

    public static void main(String[] args) {
        List<String[]> listOfSentences = new ArrayList<>();
        String[] sentence1 = {"Hello world", "world", "hello"};
        String[] sentence2 = {"world", "hello", "world hello"};
        listOfSentences.add(sentence1);
        listOfSentences.add(sentence2);
        String targetWord = "hello";
        System.out.println((searchWord(listOfSentences, targetWord)));
    }
}
