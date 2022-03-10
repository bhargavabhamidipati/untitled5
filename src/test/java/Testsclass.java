import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testsclass {
    public static Calculator calculator;
    @BeforeClass
    public static void setup(){
        calculator = new Calculator();
    }
    // Bhargava Bhamidipati TestCases
    @Test
    void testAdd() {
        assertEquals(28, calculator.add(16, 12));
    }
    @Test
    void testAddNeg() {
        assertEquals(-4, calculator.add(12, -16));
    }
    @Test
    void testAddZero() {
        assertEquals(872, calculator.add(872, 0));
    }
    @Test
    void testAddMax() {
        assertEquals(Integer.MAX_VALUE - 1, calculator.add(Integer.MAX_VALUE, -1));
    }
    @Test
    void testAddMin() {
        assertEquals(Integer.MIN_VALUE + 1, calculator.add(Integer.MIN_VALUE, 1));
    }
    @Test
    void testAddMaximums() {
        assertEquals(-1, calculator.add(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
    @Test
    void testAddOutOfScopePos() {
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1)); //wrong result, but expected
    }
    @Test
    void testAddOutOfScopeNeg() {
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MIN_VALUE, -1)); //same
    }

    }
