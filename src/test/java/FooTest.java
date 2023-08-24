import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooTest  {

    @Test
     void testGetBar() {
        Foo foo = new Foo();

        String result = foo.getBar();

        assertEquals("FooBar",result);
    }
}