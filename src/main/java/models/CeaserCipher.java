package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CeaserCipher {

    private final String userInput;
    private final int shiftNumber;
    private final String cipherConverter;

    public CeaserCipher(String userInput, int shiftNumber, String cipherConverter) {
        this.userInput = userInput;
        this.shiftNumber = shiftNumber;
        this.cipherConverter = cipherConverter;
    }

    public String getUserInput() { return this.userInput;}

    public int getShiftNumber() { return this.shiftNumber;}

    public String getCipherConverter() {return this.cipherConverter;}

    public String isString() { return userInput.getClass().getSimpleName();}

    public String isInteger() {
        Integer newShiftNumber = shiftNumber;
        return newShiftNumber.getClass().getSimpleName();
    }

    public String cipher(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<String> alphabetArray = new ArrayList<>(Arrays.asList(alphabet.split("")));
        List<String> userInputArray = new ArrayList<>(Arrays.asList(userInput.split("")));
        List<String> convertedArray = new ArrayList<>();

        if (cipherConverter.equals("encode")) {
            for (String letter : userInputArray) {
                int newLetterIndex = alphabetArray.indexOf(letter) + shiftNumber;
                if (newLetterIndex > alphabet.length()-1) {
                    convertedArray.add(alphabetArray.get(newLetterIndex - alphabet.length()));
                } else if (letter.equals(" ")) {
                    convertedArray.add(" ");
                }else {
                    convertedArray.add(alphabetArray.get(newLetterIndex));
                }
            }
        }else if(cipherConverter.equals("decode")){
            for (String letter : userInputArray) {
                int newLetterIndex = alphabetArray.indexOf(letter) - shiftNumber;
                if (letter.equals(" ")) {
                    convertedArray.add(" ");
                } else if (newLetterIndex < 0) {
                    convertedArray.add(alphabetArray.get(newLetterIndex + alphabet.length()));
                }else {
                    convertedArray.add(alphabetArray.get(newLetterIndex));
                }
            }
        }
        return String.join("",convertedArray);
    }


}
