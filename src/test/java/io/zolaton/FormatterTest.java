package io.zolaton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FormatterTest 
{
    Formatter formatter = new Formatter();

    @Test
    public void testApp()
    {
        assertEquals("Hello world from Formatter", formatter.greet("world"));
    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
}
