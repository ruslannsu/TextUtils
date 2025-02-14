package writers;

import java.util.ArrayList;

public class DirectWriter {
    ArrayList<String> output_;
    public DirectWriter(ArrayList<String> output) {
        output_ = output;
    }
    public void write() {
        for (int i = 0; i != output_.size(); ++i) {
            System.out.println(output_.get(i));
        }
    }
}
