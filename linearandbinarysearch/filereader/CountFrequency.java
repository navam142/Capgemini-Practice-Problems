package linearandbinarysearch.filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountFrequency {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\users\\Navam\\Desktop\\Practice-Problems\\linearandbinarysearch\\filereader\\files\\paragraph.txt");
            BufferedReader br = new BufferedReader(fr);

            String targetWord = "it";
            String line;
            int c = 0;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(" ");
                for (String word : arr) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        c++;
                    }
                }
            }
            System.out.println("target word occurence: " + c);
            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
    }
}
