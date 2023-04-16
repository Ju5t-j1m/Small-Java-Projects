
/**
 * 
 * A class that implements a queue.  It is your job to complete this class.  Your queue
 * will use a linked list constructed by QueueElements.  However, your queue must be general and allow
 * setting of any type of Object.  Also you cannot use ArrayLists or arrays (you will get zero).  
 * @author you
 *
 */


import java.util.NoSuchElementException;

public class Queue<T> {
	private QueueElement<T> head; 
	private QueueElement<T> tail;
	
	//TODO:  You need some data to store the queue.  Put the attributes here.

	
	/**
	 * Constructs an empty Queue.
	 */
	public Queue () {
		tail= null;
		head = null;
		
	    //TODO: Write the Queue constructor
	}
	
	public QueueElement<T> getTail() {
		return tail;
	}
	
	public QueueElement<T> setTail(QueueElement<T> tail) {
		this.tail = tail;
		return null;
	}
	
	/**
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty () {
		
		if (head == null){
			return true;
		} else {
			 return false;
		}
	    //TODO:  Needs to return true when empty and false otherwise
	}
	
	
	/**
	 * Returns the element at the head of the queue
	 */
	public T peek () throws NoSuchElementException {
		
		if (this.isEmpty()) {
			throw new NoSuchElementException();
		}else {
			return head.getElement();
		}
		 //DELETE AND CHANGE TO SOMETHING SENSIBLE
	}
	
	/**
	 * Removes the front element of the queue
	 */
	public void dequeue () throws NoSuchElementException {
		head = head.getNext();
		
		
	    //Dequeue code is needed here
	}
	
	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue (T element) {
		QueueElement<T> counter;
		
	if (this.isEmpty()) {
			head= new QueueElement<T>(element, null);
		
	    //Enqueue code is needed here
	}else{
		counter = head;
		while (counter.getNext() != null) {
			counter = counter.getNext();
			
			
		}
		QueueElement<T> newLink = new QueueElement<T>(element, null);
		counter.setNext(newLink);
      }
 }
	
	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 */
	public void print () {
	    //Code to print the code is needed here
	}
}
