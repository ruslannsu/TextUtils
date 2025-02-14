import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputParser ip = new InputParser("src/input1.txt");
        Writer wr = new Writer(ip.input_text_);
        wr.reverse_write();
    }
}