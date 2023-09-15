import java.util.Scanner;
import java.util.ArrayList;

class calculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //This is for user input
        System.out.println("Welcome to the Java calculator");

        boolean finishedCollectingNumbers = false; //a boolean to flag whether the user has finished entering numbers

        ArrayList<String> input = new ArrayList<String>(); // arraylist for all of the user inputs
        ArrayList<Integer> nums = new ArrayList<Integer>(); //arraylist for all of the user inputs which are valid numbers
        int i = 0; //loop index
        while(finishedCollectingNumbers == false)
        {
            System.out.println("Please enter a number or if you are finished, enter 'Done' ");
            input.add(scanner.next().toLowerCase()); //using .toLowerCase as if they enter "Done" instead of "done" it doesnt work


            if(input.get(i).equals("done"))
            {
                //if the user enters "done" then the user is finished entering numbers and will break the loop
                finishedCollectingNumbers = true;
            }
            else //With this we just have to hope that if what they enter isnt "done" then it is an acceptable number...
            {
                nums.add(Integer.parseInt(input.get(i)));

                //in future I can add validation techniques to ensure that the data entered is safe.
            }

            i++;
        }

        System.out.println("Would you like to \n 1: + \n 2: - \n 3: *" );
        String operatorInput = scanner.next();
        int inputparsed = Integer.parseInt(operatorInput);
        scanner.close();
        if(inputparsed == 1){
            Add add = new Add(nums);
            System.out.println(add.getOutput());

        } else if (inputparsed == 2)
        {
            Subtract sub = new Subtract(nums);
            System.out.println(sub.getOutput());
        } else if (inputparsed == 3)
        {
            Multiply multiply = new Multiply(nums);
            System.out.println(multiply.getOutput());
        } else {
            System.out.println("Please re run this program and enter a number between 1 and 3");
        }


    }


    static class Add {
        public int output;
        public String outputString;

        public Add(ArrayList<Integer> input){
            for(int i = 0; i < input.size(); i++)
            {
                output += input.get(i);
            }
            outputString = "The output is: ";
        }
        public String getOutput(){
            outputString += Integer.toString(output);
            return outputString;
        }
    }
    static class Subtract{
        public int output;
        public String outputString;

        public Subtract(ArrayList<Integer> input){

            for(int i = 0; i < input.size(); i++)
            {
                output -= input.get(i);
            }
            outputString = "The output is: ";
        }
        public String getOutput(){
            outputString += Integer.toString(output);
            return outputString;
        }
    }
    static class Multiply{
        public int output = 1;
        public String outputString;

        public Multiply(ArrayList<Integer> input){

            for(int i = 0; i < input.size(); i++)
            {
                output *= input.get(i);
            }
            outputString = "The output is: ";
        }
        public String getOutput(){
            outputString += Integer.toString(output);
            return outputString;
        }
    }
}

