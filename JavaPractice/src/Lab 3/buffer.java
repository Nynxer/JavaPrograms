import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buffer {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(""));

        char input = (char) reader.read();
        System.out.println("Character: " + input);
        reader.close();
    }
}
