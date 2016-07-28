
public class CircularlyLinkedList<E> {

	private Node<E> tail = null;       // initialization of the tail.
	private int size = 0;        // initialization of the size of the list.
	
	public CircularlyLinkedList()
	{
		// Empty constructor called to generate empty list. 
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public int size()
	{
		return size;
	}
	
	public E first()
	{
		if(isEmpty())            // If the list is empty, return null.
			return null;
		
		return tail.getNext().getElement();           // Head is after the tail.
		
	}
	
	public E last()
	{
		if(isEmpty())
		return null;                      // If empty, we will return a null.
	    
		return tail.getElement();         // return the tail.
	}
	
	public void rotate()
	{
		if(!isEmpty())
		{
			
			tail = tail.getNext();
			
		}
	    
		// Method will do nothing if the list is empty. 
	}
	
	
	
	public void addFirst(E e)
	{
		if(isEmpty())
		{
			tail = new Node<>(e,null);      // tail takes element but no reference to next node. 
			tail.setNext(tail);
			
		}
		else
		{
			Node<E> newest = new Node<>(e, tail.getNext());   // New node is created with the head being the next pointer.
			tail.setNext(newest);
		}
		
		size++;                            // Size is incremented upwards. 
		
	}
	
	
	public void addLast(E e)
	{
		addFirst(e);                     // Element is inserted in front of the list.
		tail = tail.getNext();           // tail is also linked to the head. 
	}
	
	public E removeFirst()
	{
		if(isEmpty())                   // If list is empty, return a null value.
			return null; 
		
		Node<E> head = tail.getNext();  // head is the node that is after the tail node. 
		
		if(head==tail)
		{
			return null;
		}
		else
		{
			tail.setNext(head.getNext());    // Head is removed, so we set the new head to be the node after the
			                                 // "original" head.  
		}
		size--;
		return head.getElement();
		
	}
	
	
}
