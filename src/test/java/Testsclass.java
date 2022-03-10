import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testsclass {
    public static Calculator obj;
    @BeforeClass
    public static void setup(){
        obj = new Calculator();
    }
    // TestCase 1
    @Test
    public void testAdd(){
        assertEquals(4,obj.add(2,2));
        assertEquals(0,obj.add(2,-2));
        assertEquals(-4,obj.add(-2,-2));
    }
    }
