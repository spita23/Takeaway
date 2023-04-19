package is.hi.bst4.vinnsla;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Karfatest {

    @Test
    public void testKarfa() {
        Matsedill m = new Matsedill();
        m.getAllarVeitingar();
        Karfa k = new Karfa();
        k.baetavidKorfu(m.getVeitingar(0));
        k.baetavidKorfu(m.getVeitingar(2));
        assertEquals(6498, k.reiknaHeildarverd().get());
    }
}
