package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserCipherTest {

    @Test
    void newCeaserCipher_instantiates_correctly() {
        CeaserCipher newCipher = new CeaserCipher("User input", 1);
        assertTrue(newCipher instanceof CeaserCipher);
    }

    @Test
    void newCeaserCipher_getsUserInput() {
        CeaserCipher testInputType = new CeaserCipher("User input", 1);
        assertEquals(testInputType.isString(), testInputType.getUserInput().getClass().getSimpleName());
    }

    @Test
    void newCeaserCipher_getsShiftNumber() {
        CeaserCipher testShiftNumber = new CeaserCipher("User input", 1);
        Integer wrappedShiftNumber = testShiftNumber.getShiftNumber();
        assertEquals(testShiftNumber.isInteger(), wrappedShiftNumber.getClass().getSimpleName());
    }


}