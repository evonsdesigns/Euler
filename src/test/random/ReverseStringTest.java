package test.random;

import org.junit.Test;
import random.ReverseString;

import static org.junit.Assert.assertEquals;

/**
 * Created by josep_000 on 5/26/2014.
 */
public class ReverseStringTest {

    @Test
    public void testReverseString() {
        assertEquals("dlroW olleH", ReverseString.reverse("Hello World"));
    }
}
