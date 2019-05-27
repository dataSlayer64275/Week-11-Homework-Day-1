import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void canDrink(){
        assertEquals(90, waterbottle.Drink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterbottle.Empty());
    }

    @Test
    public void canFill(){
        waterbottle.Empty();
        assertEquals(100, waterbottle.Fill());
    }
}
