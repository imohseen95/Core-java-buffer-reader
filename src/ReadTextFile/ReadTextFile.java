package ReadTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/rejuanaahmed/IdeaProjects/ReadTextFile/src/ReadTextFile/TextFile.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path);
        } catch (Exception ex1) {
            System.out.println("File not found");
        }
        try {
            br = new BufferedReader(fr);
            String text = "";
            while ((text = br.readLine()) != null) {
                System.out.println(text);
            }
        } catch (Exception ex2) {
            System.out.println("File not read");
        }
        finally {
            if (fr != null) ;
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (br != null) ;
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}