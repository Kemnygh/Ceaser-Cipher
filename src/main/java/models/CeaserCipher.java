package models;

public class CeaserCipher {

    private final String userInput;
    private final int shiftNumber;

    public CeaserCipher(String userInput, int shiftNumber) {
        this.userInput = userInput;
        this.shiftNumber = shiftNumber;
    }

    public String getUserInput() { return this.userInput;}

    public int getShiftNumber() { return this.shiftNumber;}

    public String isString() { return userInput.getClass().getSimpleName();}

    public String isInteger() {
        Integer newShiftNumber = shiftNumber;
        return newShiftNumber.getClass().getSimpleName();
    }

}
