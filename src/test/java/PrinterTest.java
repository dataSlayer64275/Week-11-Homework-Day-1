import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before() { printer = new Printer(30, 20);}

    @Test
    public void canPrint(){
        assertEquals(15, printer.Print(5,3));

    }

    @Test
    public void cannotPrintWhenLackingPaper(){
        assertEquals(0, printer.Print(7,5));
    }

    @Test
    public void canReduceTonerVolume(){
        assertEquals(5, printer.Print(5,3));
    }
}
