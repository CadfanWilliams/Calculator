import java.util.ArrayList;

public class Multiply {
    public int output = 1;
    public String outputString;

    public Multiply(ArrayList<Integer> input) {
    output = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            output *= input.get(i);
        }
        outputString = "The output is: " + output;
    }
}