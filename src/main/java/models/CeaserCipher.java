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

        for (String letter : userInputArray) {
            int newLetterIndex = alphabetArray.indexOf(letter) + shiftNumber;
            if(newLetterIndex > 25) {
                convertedArray.add(alphabetArray.get(newLetterIndex-26));
            }else{
                convertedArray.add(alphabetArray.get(newLetterIndex));
            }
        }
        return String.join("",convertedArray);
    }


}
