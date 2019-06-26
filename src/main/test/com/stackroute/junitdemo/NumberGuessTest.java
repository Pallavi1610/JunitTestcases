
import com.stackroute.junitdemo.*;
import com.stackroute.junitdemo.NumberGuess;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class NumberGuessTest {

    NumberGuess obj;


    @org.junit.Before
    public void setUp() throws Exception {
        NumberGuess obj = new NumberGuess();
    }
    @org.junit.After
    public void tearDown() throws Exception {
        obj= null;
    }
    @Test
    public void checkWhetherTheNumberIsCorrect() {
        String result= obj.guessTheNumber(new int[]{10, 20, 30});
        assertEquals("Number guessed matches the original number", result);
    }


}