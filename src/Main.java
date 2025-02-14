import java.io.IOException;
import writers.*;
public class Main {
    public static void main(String[] args) throws IOException {
        InputParser ip = new InputParser("src/input1.txt");
        DirectWriter wr = new DirectWriter(ip.input_text_);
        ReverseWriter rw = new ReverseWriter(ip.input_text_);
        rw.write();
    }
}