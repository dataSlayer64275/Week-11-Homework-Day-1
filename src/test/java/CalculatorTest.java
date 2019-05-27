import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator(); }

    @Test
    public void canAdd() {
        assertEquals(4, calculator.Add(3,1));
    }

    @Test
    public void canSubtract() {
        assertEquals(1, calculator.Subtract(7,6));
    }

    @Test
    public void canDivide() {
        assertEquals(1.5, calculator.Divide(3,2), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(21, calculator.Multiply(3,7));
    }
}
