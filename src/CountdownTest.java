import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by painter on 9/9/15.
 */
public class CountdownTest {

    @Test
    public void Test_For_1() {
        assertEquals("1\n", Countdown.pattern(1));
    }
    @Test
    public void Test_For_5() {
        assertEquals("54321\n4321\n321\n21\n1\n", Countdown.pattern(5));
    }
    @Test
    public void Test_For_10() {
        assertEquals("10987654321\n987654321\n87654321\n7654321\n654321\n54321\n4321\n321\n21\n1\n", Countdown.pattern(10));
    }
    @Test
    public void Test_For_0() {
        assertEquals("", Countdown.pattern(0));
    }
    @Test
    public void Test_For_Minus5() {
        assertEquals("", Countdown.pattern(-5));
    }
}