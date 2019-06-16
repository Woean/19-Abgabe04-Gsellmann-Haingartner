package at.fhj.msd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * this a test class for the StringQueue, it tests all methods in different ways to cover up
 * nearly all possible cases with JUnit.
 *
 *
 */
public class StringQueueTest {
    private Queue s;


    /**
     *
     * Builds a String Queue with size 5
     */
    @Before
    public void setup() {
        s = new StringQueue(5); // keep size of 5 !!
    }

    /**
     *
     * tests if offer() returns false if its full and you try to add something
     */
    @Test
    public void testOfferOverMaxSize() {
        s.offer("one");
        s.offer("two");
        s.offer("three");
        s.offer("four");
        s.offer("five");

        Assert.assertFalse(s.offer("first"));
    }


    /**
     * tests if offer returns true if its not empty
     */
    @Test
    public void testOfferOneElement() {
        Assert.assertTrue(s.offer("first"));
    }

    /**
     * tests if poll() works and returns one element before deleting it
     */
    @Test
    public void testPoll() {

        s.offer("one");
        Assert.assertEquals(s.poll(), "one");
    }

    /**
     * tests if poll returns null when Queue is empty
     */
    @Test
    public void testPollIsEmpty() {
        Assert.assertNull(s.poll());
    }

    /**
     * tests if poll does not return null, if it is not empty
     */
    @Test
    public void testPollIsNotEmpty() {
        s.offer("Hallo");
        Assert.assertNotNull(s.poll());
    }

    /**
     * tests if peek works right, according to first in first out principle
     */
    @Test
    public void testPeek() {

        s.offer("one");
        s.offer("two");
        Assert.assertEquals(s.peek(), "one");
    }

    /**
     * tests if peek returns null when its empty
     */
    @Test
    public void testPeekIsEmpty() {
        Assert.assertNull(s.peek());
    }

    /**
     * tests if peek returns not null when the queue is not empty
     */
    @Test
    public void testPeekIsNotEmpty() {
        s.offer("Hallo");
        Assert.assertNotNull(s.peek());
    }


    /**
     * tests if remove returns the value before removing it
     */
    @Test
    public void testRemove() {
        s.offer("Hallo");

        Assert.assertEquals(s.remove(), "Hallo");
    }


    /**
     *tests if remove returns not null, when the Queue is not empty
     */
    @Test
    public void testRemoveIsNotEmpty() {
        s.offer("Hallo");
        Assert.assertNotNull(s.remove());
    }

    /**
     * tests if element() returns the value before removing
     */
    @Test
    public void testElement() {
        s.offer("Hallo");
        Assert.assertEquals(s.element(), "Hallo");
    }

    /**
     * tests if awaited exception is triggered
     */
    @Test(expected = NoSuchElementException.class)
    public void testNoSuchElementException() {
        s.element();
        s.remove();
    }



}

