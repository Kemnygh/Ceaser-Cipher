import models.CeaserCipher;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CeaserCipher newCipher = new CeaserCipher("word", 5, "encode");
    }
}
