import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java calculator");
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        String inputnum1 = scanner.next();
        System.out.println("Enter the second number");
        String inputnum2 = scanner.next();

        int num1 = Integer.parseInt(inputnum1);
        int num2 = Integer.parseInt(inputnum2);
        
        
        int output = 0;
        System.out.println("The numbers are " + num1 + " and " + num2 + "\n would you like to \n 1: + \n 2: - \n 3: *" );
        String input = scanner.next();
        int inputparsed = Integer.parseInt(input); 

        if(inputparsed == 1){
            output = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + output);
        } else if (inputparsed == 2)
        {
            output = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + output);
        } else if (inputparsed == 3)
        {
            output = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + output);
        } else {
            System.out.println("Please re run this program and enter a number between 1 and 3");
        }

        scanner.close();

    }
}