import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextLogicTest {

    @Test
    public void testLineCount() {


        //arrange
        TextLogic TDD = new TextLogic();
        //act
        TDD.addLineCount();
        int actual = TDD.getLineCount();
        int expected = 1;
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCharCount() {


        //arrange
        TextLogic TDD = new TextLogic();
        //act
        TDD.addCharCount("Hej");
        int actual = TDD.getCharCount();
        int expected = 3;
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testSetLW() {


        //arrange
        TextLogic TDD = new TextLogic();
        //act
        TDD.setLW("Göteborg");
        TDD.setLW("Örebro");
        String actual = TDD.getLW();
        String expected = "Göteborg";
        //assert
        assertEquals(expected, actual);
    }




}
