import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testsclass {
    public static Calculator calculator;
    @BeforeClass
    public static void setup(){
        calculator = new Calculator();
    }
    //Bhargava Bhamidipati TestCase 1
    @Test
    public void testAdd(){
        assertEquals(4,calculator.add(2,2));
        assertEquals(0,calculator.add(2,-2));
        assertEquals(-4,calculator.add(-2,-2));
    }
    }
