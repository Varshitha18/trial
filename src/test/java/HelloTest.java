import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    @Test
    public void whatTheHell() {
        Hello hi = new Hello();
        String ex = hi.callMe();
        assertEquals("Hi", ex);
    }
}
