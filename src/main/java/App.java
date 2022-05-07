import models.CeaserCipher;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Ceaser Cipher App");

        userInteraction();

    }

    public static void userInteraction(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Type 'encode' to encode your message or 'decode' to decode your message");
        String conversionMode = myScanner.nextLine();

        System.out.println("Please enter the message you want to " + conversionMode + " (kindly note numbers should be written in word form)");
        String userMessage = myScanner.nextLine();
        System.out.println("Enter a number between 1 & 25 you would wish to " + conversionMode + " your message with.");
        int conversionVariable = myScanner.nextInt();

        CeaserCipher newCipher = new CeaserCipher(userMessage, conversionVariable, conversionMode);

        System.out.println("------------------------------");
        System.out.println("Your "+ conversionMode + " message is: " +newCipher.cipher().toUpperCase(Locale.ROOT));
    }
}


//if (!conversionMode.equals("encode") && !conversionMode.equals("decode")) {
//            System.out.println("Invalid entry");
//        }