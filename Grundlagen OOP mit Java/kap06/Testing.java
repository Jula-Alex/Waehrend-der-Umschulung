import java.io.*;

public class InputStreamReaderFileExample {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("example.txt"));
             BufferedReader bufferedReader = new BufferedReader(reader)) {
             
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
