package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAtm {


    @Test
    public void testAddition() {

        int x = 0;
        int expected = 5;
        int actual = addition(0,5);
        assertEquals(expected, actual);

    }

    @Test
    public void testSubtraction() {
        int x = 0;
        int expected = 5;
        int actual = subtraction(0,5);
        assertEquals(expected, actual);

    }

    @Test
    public int addition(int x, int addend) {
    return x + addend;
    }
    @Test
    public int subtraction(int x, int i) {
        return x - i;
    }
}
