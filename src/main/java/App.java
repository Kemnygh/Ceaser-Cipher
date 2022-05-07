import models.CeaserCipher;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to Ceaser Cipher App");
        System.out.println("------------------------------");
        System.out.println("Type 'encode' to encode your message or 'decode' to decode your message");
        String conversionMode = myScanner.nextLine();
        System.out.println("Please enter the message you want to " + conversionMode);
        String userMessage = myScanner.nextLine();
        System.out.println("Enter a number between 1 & 25 you would wish to " + conversionMode + " your message with.");
        int conversionVariable = myScanner.nextInt();

        CeaserCipher newCipher = new CeaserCipher(userMessage, conversionVariable, conversionMode);

        System.out.println("------------------------------");
        System.out.println("Your "+ conversionMode + " message is " +newCipher.cipher().toUpperCase(Locale.ROOT));
    }
}
