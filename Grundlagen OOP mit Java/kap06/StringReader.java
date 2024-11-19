import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

public class StringReaderExample {
    public static void main(String[] args) {
        String text = "Ciao\nCome stai?";
        BufferedReader br = new BufferedReader(new StringReader(text));

        try {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
