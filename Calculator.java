import java.util.Random;
import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java calculator");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randnum1 = random.nextInt(99);
        int randnum2 = random.nextInt(99);
        int output = 0;
        System.out.println("The numbers are " + randnum1 + " and " + randnum2 + "\n would you like to \n 1: + \n 2: - \n 3: *" );
        String input = scanner.next();
        int inputparsed = Integer.parseInt(input); 

        if(inputparsed == 1){
            output = randnum1 + randnum2;
            System.out.println(randnum1 + " + " + randnum2 + " = " + output);
        } else if (inputparsed == 2)
        {
            output = randnum1 - randnum2;
            System.out.println(randnum1 + " - " + randnum2 + " = " + output);
        } else if (inputparsed == 3)
        {
            output = randnum1 * randnum2;
            System.out.println(randnum1 + " * " + randnum2 + " = " + output);
        } else {
            System.out.println("Please re run this program and enter a number between 1 and 3");
        }

        
    }
}