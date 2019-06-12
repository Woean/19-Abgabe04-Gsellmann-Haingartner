package at.fhj.iit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StringQueueTest {

    private Queue s;

    @Before
    public void setup() throws Exception
    {
        s = new StringQueue(5); // keep size of 5 !!
    }

    @Test
    public void testPollIsEmpty() throws Exception {
        Assert.assertNull(s.poll());
    }

    @Test
    public void testPollIsNotEmpty() throws Exception {
        s.offer("Hallo");
        Assert.assertNotNull(s.poll());
    }

    @Test
    public void testPeekIsEmpty() throws Exception {
        Assert.assertNull(s.peek());
    }

    @Test
    public void testPeekIsNotEmpty() throws Exception {
        s.offer("Hallo");
        Assert.assertNotNull(s.peek());
    }

    @Test
    public void testRemoveIsNotEmpty () {
        s.offer("Hallo");
        s.offer("Hallo");
        Assert.assertNotNull(s.remove());
    }

    @Test(expected = NoSuchElementException.class)
    public void testNoSuchElementException() {
        s.element();
        s.poll();
    }
}
