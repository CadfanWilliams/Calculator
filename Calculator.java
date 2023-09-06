import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java calculator");
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String inputnum1 = scanner.next();
        System.out.print("Enter the second number: ");
        String inputnum2 = scanner.next();
        
        int num1 = Integer.parseInt(inputnum1);
        int num2 = Integer.parseInt(inputnum2);
        
        System.out.println("The numbers are " + num1 + " and " + num2 + "\n would you like to \n 1: + \n 2: - \n 3: *" );
        String input = scanner.next();
        int inputparsed = Integer.parseInt(input); 
        scanner.close();
        if(inputparsed == 1){
            Add add = new Add(num1, num2);
            System.out.println(add.getOutput());

        } else if (inputparsed == 2)
        {
            Subtract sub = new Subtract(num1, num2);
            System.out.println(sub.getOutput());
        } else if (inputparsed == 3)
        {
           Multiply multiply = new Multiply(num1, num2);
           System.out.println(multiply.getOutput());
        } else {
            System.out.println("Please re run this program and enter a number between 1 and 3");
        }
    }


    static class Add {
        public int num1;
        public int num2;
        public int output;
        public String outputString;

        public Add(int input1, int input2){
            num1 = input1;
            num2 = input2;
            output = num1 + num2;
            outputString = "The output is: ";
        }
        public String getOutput(){
            outputString += Integer.toString(output);
            return outputString;
        }
    }
    static class Subtract{
        public int num1;
        public int num2;
        public int output;
        public String outputString;

        public Subtract(int input1, int input2){
            num1 = input1;
            num2 = input2;
            output = num1 - num2;
            outputString = "The output is: ";
        }
        public String getOutput(){
            outputString += Integer.toString(output);
            return outputString;
        }
    }
    static class Multiply{
        public int num1;
        public int num2;
        public int output;
        public String outputString;

        public Multiply(int input1, int input2){
            num1 = input1;
            num2 = input2;
            output = num1 * num2;
            outputString = "The output is: ";
        }
        public String getOutput(){
            outputString += Integer.toString(output);
            return outputString;
        }
    }
}

