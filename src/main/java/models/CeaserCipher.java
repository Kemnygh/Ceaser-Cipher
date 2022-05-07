package models;

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



}
