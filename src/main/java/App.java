import models.CeaserCipher;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Ceaser Cipher App");
        Scanner myScanner = new Scanner(System.in);

        boolean isUserOn = true;

        while (isUserOn) {
            userInteraction();
            System.out.println("\n-----------------------------------------------------------\n");
            System.out.println("Do you wish to encode or decode another message (yes/no)");
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
            String conversionMode = myScanner.nextLine();


            System.out.println("Please enter the message you want to " + conversionMode + " (kindly note numbers should be written in word form)");
            String userMessage = myScanner.nextLine();

            System.out.println("Enter a number between 1 & 25 you would wish to " + conversionMode + " your message with.");
            int conversionVariable = myScanner.nextInt();


            CeaserCipher newCipher = new CeaserCipher(userMessage, conversionVariable, conversionMode);

            System.out.println("--------------------------------------------------------------------\n");
            System.out.println("Your " + conversionMode + " message is: " + newCipher.cipher().toUpperCase(Locale.ROOT));
        }catch (Exception e){
            //InputMismatchException
            //NullPointerException
//
            e.printStackTrace();
        }
    }

    public enum ConversionType
    {
        encode,
        decode
    }
}
