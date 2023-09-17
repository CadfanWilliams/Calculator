import java.util.ArrayList;

public class Add {
    public int output;
    public String outputString;

    public Add(ArrayList<Integer> input){
        for(int i = 0; i < input.size(); i++)
        {
            output += input.get(i);
        }
        outputString = "The output is: " + Integer.toString(output);
    }

}