import models.CeaserCipher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        boolean isUserOn = true;

        System.out.println("Welcome to Ceaser Cipher App");

        while (isUserOn) {
            userInteraction();
            System.out.println("\n-----------------------------------------------------------\n");
            System.out.println("Do you wish to encode or decode a new message (yes/no)");
            String userContinue = myScanner.nextLine();
            if (userContinue.equalsIgnoreCase("yes")){
                userInteraction();
            }else{
                isUserOn = false;
                System.out.println("\nThank you, Good bye!");
            }
        }
    }

    public static void userInteraction(){
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("Type 'encode' to encode your message or 'decode' to decode your message");
            String conversionMode = myScanner.nextLine().trim().toLowerCase();

            System.out.println("Please enter the message you want to " + conversionMode + " (kindly note numbers should be written in word form)");
            String userMessage = myScanner.nextLine().replaceAll("\\s+$", "");

            System.out.println("Enter a number between 1 & 25 you would wish to " + conversionMode + " your message with.");
            String conversionStringVariable = myScanner.nextLine().replaceAll("\\s+$", "");
            int conversionVariable = Integer.parseInt(conversionStringVariable);


            if (!conversionMode.equals("encode") && !conversionMode.equals("decode")) {
                System.out.println("-------------------------------------------------------------\n");
                System.out.println("**Conversion Type error:\nInvalid entry! Please make sure to enter the correct conversion mode (encode or decode)\n");
                userInteraction();
            } else if (conversionVariable < 0 || conversionVariable > 25) {
                System.out.println("-------------------------------------------------------------\n");
                System.out.println("**Conversion Number error:\nInvalid entry! Please enter a number between 1 & 25\n");
                userInteraction();
            } else {
                CeaserCipher newCipher = new CeaserCipher(userMessage, conversionVariable, conversionMode);

                System.out.println("--------------------------------------------------------------------\n");
                System.out.println("Your " + conversionMode + "d message is: " + newCipher.cipher().toUpperCase());
            }
        }catch(InputMismatchException e){
            System.out.println("--------------------------------------------------------------------\n");
            System.out.println("**Conversion Number error:\nInvalid entry! No text allowed, please enter numbers between 1 & 25\n");
        }catch (NumberFormatException e){
            System.out.println("--------------------------------------------------------------------\n");
            System.out.println("**Conversion Number error:\nInvalid entry! Don't press enter or insert space before you insert the number, (1 & 25)\n");
        }

    }
}
