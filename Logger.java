import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Logger {
    //want to give the logger output of a calculation and write it to a file
    public Logger(String FilePath, String Output)
    {
        String filePath = FilePath;
        String output = Output;
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(output);
            writer.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
