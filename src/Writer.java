import java.util.ArrayList;

public class Writer {
    ArrayList<String> output_;
    public Writer(ArrayList<String> output) {
        output_ = output;
    }
    public void write() {
        for (int i = 0; i != output_.size(); ++i) {
            System.out.println(output_.get(i));
        }
    }
    public void reverse_write() {
        for (int i = output_.size() - 1; i >= 0; --i) {
            System.out.println(output_.get(i));
        }
    }

}
