import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

class calculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //This is for user input
        System.out.println("Welcome to the Java calculator");

        ArrayList<Integer> numbs = InputViaFile();
        System.out.println("The input was " + numbs);

        System.out.println("Would you like to \n 1: + \n 2: - \n 3: * \n 4: /");
        String operatorInput = scanner.next();
        int inputparsed = Integer.parseInt(operatorInput);
        scanner.close();
        String outputString = "";
        switch (inputparsed) {
            case 1:
                Add add = new Add(numbs);
                outputString  = add.outputString;
                System.out.println(outputString);

                break;
            case 2:
                Subtract sub = new Subtract(numbs);
                outputString = sub.outputString;
                System.out.println(outputString);

                break;
            case 3:
                Multiply multiply = new Multiply(numbs);
                outputString = multiply.outputString;
                System.out.println(outputString);

                break;
            case 4:
                Divide divide = new Divide(numbs);
                outputString = divide.outputString;
                System.out.println(outputString);

                break;
            default:

                System.out.println("Please re run this program and enter a number between 1 and 3");
                break;
        }

        Logger logger = new Logger("output", outputString);


    }





        public static ArrayList<Integer> InputViaUser ()
        {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> input = new ArrayList<>(); // arraylist for all the user inputs
            ArrayList<Integer> nums = new ArrayList<>(); //arraylist for all the user inputs which are valid numbers
            boolean finishedCollectingNumbers = false; //a boolean to flag whether the user has finished entering numbers
            int i = 0; //loop index
            while (!finishedCollectingNumbers) {
                System.out.println("Please enter a number or if you are finished, enter 'Done' ");
                input.add(scanner.next().toLowerCase()); //using .toLowerCase as if they enter "Done" instead of "done" it doesn't work


                if (input.get(i).equals("done")) {
                    //if the user enters "done" then the user is finished entering numbers and will break the loop
                    finishedCollectingNumbers = true;
                } else //With this we just have to hope that if what they enter isnt "done" then it is an acceptable number...
                {
                    nums.add(Integer.parseInt(input.get(i)));

                    //in the future, I can add validation techniques to ensure that the data entered is safe.
                }

                i++;
            }
            return nums;
        }

        public static ArrayList<Integer> InputViaFile()
        {

            ArrayList<Integer> nums = new ArrayList<>(); //arraylist for all of the user inputs which are valid numbers
            String currentLine;
            try {
                BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
                while((currentLine = reader.readLine()) != null)
                {
                    nums.add(Integer.parseInt(currentLine));
                }

                reader.close();
            }catch (IOException e)
            {
                e.printStackTrace();
            }
            return nums;
        }







}

