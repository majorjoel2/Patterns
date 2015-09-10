import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by painter on 09/09/2015.
 */
public class PikachuTest {

    @Test
    public void testMakePikachu() throws Exception {
        assertEquals(" (\\__/)\n (o^.^)\nz(_(“)(“)", Pikachu.makePikachu());
    }
}