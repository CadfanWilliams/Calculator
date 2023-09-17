import java.util.ArrayList;

public class Subtract{
    public int output;
    public String outputString;

    public Subtract(ArrayList<Integer> input){
    output = input.get(0);
        for(int i = 1; i < input.size(); i++)
        {
            output -= input.get(i);
        }
        outputString = "The output is: " + output;
    }
}