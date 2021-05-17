import org.junit.BeforeClass;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FactorialsTest {

    Factorials f = new Factorials();

    @BeforeClass
    public static void setup(){

    }

    @Test
    public void reverseFactorialTest(){
        assertEquals(3,f.reverseFactorial(6));
        assertEquals(5,f.reverseFactorial(120));
        assertEquals(-1,f.reverseFactorial(150));
    }
}
