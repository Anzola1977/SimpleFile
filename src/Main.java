import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        FileOutputStream fos = new FileOutputStream("text.txt");
        fos.write(string.getBytes(StandardCharsets.UTF_8));
        fos.close();
        reader.close();
    }
}
