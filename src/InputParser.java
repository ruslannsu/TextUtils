import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class InputParser {
    public final ArrayList<String> input_text_;
    InputParser(String file_path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file_path));
        input_text_ = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {
            input_text_.add(line);
            line = reader.readLine();
        }
        reader.close();
    }
}