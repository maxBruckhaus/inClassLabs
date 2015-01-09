import org.junit.Test;
import static org.junit.Assert.*;

public class PowerTest {

    @Test
    public void testPower() throws Exception {
        Power p = new Power();
        assertEquals(0.0, Power.power(3, 4, true), 0.0);
    }
}
