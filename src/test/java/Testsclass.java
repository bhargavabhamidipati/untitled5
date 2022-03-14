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

    //Florian Dabat TestCase
    @Test
    public void testSub() {
        assertEquals(-4, calculator.sub(12,16));
        assertEquals(28, calculator.sub(12,-16));
        assertEquals(-28, calculator.sub(-12,16));
        assertEquals(-12, calculator.sub(-12,0));
    }
    //Avan TestCase
    @Test
    public void testMult() {
        assertEquals(12, calculator.mult(3, 4));
        assertEquals(-12, calculator.mult(3, -4));
        assertEquals(12, calculator.mult(-3, -4));
        assertEquals(0, calculator.mult(3, 0));
        assertEquals(0, calculator.mult(0, 4));
    }
    //vishnu testcase
    @Test
    public void testDiv() {
        assertEquals(3, calculator.div(12, 4));
        assertEquals(-3, calculator.div(12, -4));
        assertEquals(3, calculator.div(-12, -4));
        assertEquals(0, calculator.div(0, 4));
    }
    // final test
    @Test
    public void testFinal(){
        assertEquals(5,calculator.add(calculator.div(2,2),
                calculator.mult(1, calculator.sub(5,2)) ));
    }


}
