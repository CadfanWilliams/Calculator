import java.util.ArrayList;

public class Divide {
    public int output;
    public String outputString;

    public Divide(ArrayList<Integer> input) {
    output = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            output /= input.get(i);
        }
        outputString = "The output is: " + output;
    }
}