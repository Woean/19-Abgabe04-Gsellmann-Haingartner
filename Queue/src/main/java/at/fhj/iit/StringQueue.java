
package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE


/**
 * @author Gsellmann und Haingartner
 * @version 1.0
 * @since 2019-06-12
 *
 * implements a Queue with strings as an array list, and implemented some typical methods: remove, poll for removing,
 * offer for adding and peek and element for just returning the first element.
 *
 */
public class StringQueue implements Queue {
	private List<String> elements = new ArrayList<String>();

	private int maxSize = 5;

	/**
	 * Constructor for a StringQueue
	 *
	 * @param maxSize defines the maximum size of the queue
	 */
	public StringQueue(int maxSize){
		this.maxSize = maxSize;
	}

	/**
	 * adds element to the queue
	 *
	 * @param obj the object to add, if the Queue is not full
	 * @return true if the Queue is not full, else returns false
	 */
	@Override
	public boolean offer(String obj) {
		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;

		return true;
	}

	/**
	 * removes first element from the Queue
	 *
	 * @return if its empty null, else the removed element
	 */
	@Override
	public String poll() {

		String element = peek();

		if(elements.size() == 0){
			return null;
		} else {
			elements.remove(0);
		}

		return element;
	}

	/**
	 * removes first element of queue
	 * @return the element which will be removed
	 * @throws NoSuchElementException if the queue is empty
	 */
	@Override
	public String remove() {
		String element = poll();

		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		else
			elements.remove(0);

		return element;
	}


	/**
	 * shows first element of queue
	 * @return the first element of the Queue, null if its empty
	 */
	@Override
	public String peek() {
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;

		return element;
	}

	/**
	 *
	 * shows first element of queue
	 * @return first element of the Queue
	 * @throws NoSuchElementException if its empty
	 */
	@Override
	public String element() {
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");

		return element;
	}

}