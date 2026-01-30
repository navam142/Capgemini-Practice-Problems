package linearandbinarysearch.filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Navam\\Desktop\\practice-problems\\linearandbinarysearch\\filereader\\files\\hello.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();


        } catch (Exception e) {
            System.out.println("file not found");
            System.exit(1);
        }

    }
}
