/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package vho.setsolver;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

public class SetProcessorTest {
    @Test
    public void setCardProcessTest() throws IOException {
        String testInput = Utils.readFileFromResource("test_set.txt");
        List<SetCard> cards = SetProcessor.process(testInput);
        assertEquals(15, cards.size());
        assertEquals(SetCard.COLOR.BLUE, cards.get(0).getColor());
        assertEquals('s', cards.get(1).getSymbol());
        assertEquals(SetCard.SHADING.UPPER, cards.get(2).getShading());
        assertEquals(1, cards.get(3).getNumber());
    }
}
