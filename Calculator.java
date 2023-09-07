import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java calculator");
        System.out.print("How many numbers would you like to operate on: ");
        String numberAmount = scanner.next();
        int numberAmountInt = Integer.parseInt(numberAmount);
        int nums[] = new int[numberAmountInt];
        
        
        for(int i = 0; i < numberAmountInt; i++){
            System.out.print("Enter number " + (i + 1) + ":");
            nums[i] = Integer.parseInt(scanner.next());
        }
        
        
        
        System.out.println("Would you like to \n 1: + \n 2: - \n 3: *" );
        String input = scanner.next();
        int inputparsed = Integer.parseInt(input); 
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

        public Add(int[] input){
            for(int i = 0; i < input.length; i++)
            {
                output += input[i];
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

        public Subtract(int[] input){

              for(int i = 0; i < input.length; i++)
            {
                output -= input[i];
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

        public Multiply(int[] input){

            for(int i = 0; i < input.length; i++)
            {
                output *= input[i];
            }
            outputString = "The output is: ";
        }
        public String getOutput(){
            outputString += Integer.toString(output);
            return outputString;
        }
    }
}

