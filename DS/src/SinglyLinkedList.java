
public class SinglyLinkedList<E> {
	
	private int size = 0;          // Initial Size of the list.
	private Node<E> head = null;   // Head of the list.
	private Node<E> tail = null;   // Tail of the list.
	
	public SinglyLinkedList()
	{
		// Empty to initialize the list. 
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
		if(isEmpty()==true)
			return null;
		
		return head.getElement();
		
	}
	
    public E last()
    {
    	if(isEmpty()==true)
    	return null;
    	
    	
    	return tail.getElement();
    	
    }
	
	public void addFirst(E e)
	{
		head = new Node<E>(e, head);   // The new node links the element being added and the head. 
		
		if(size==0)                 // if List is empty, then the tail will become the head. 
			tail = head;
		
		size++;   // Size increases.
		
	}
    
    public void addLast(E e)
    {
    	Node<E> newest = new Node<>(e, null);
    	
    	if(isEmpty())    // If list is empty, then the new node will become the tail.
    	{
    		head = newest; 
    	}
    	else            // Otherwise find the tail and connect the new Node to it.
    	{
    		tail.setNext(newest);  
    	}
    	
    	tail = newest;  // Tail is now set as the newest node.  
    	size++;         // Increment the size of the list. 
    }
    
    public E removeFirst()
    {
    	if(size==0)
    		return null;
    	E answer = head.getElement(); // Grab the element and store it inside answer; [ if unempty ]
    	head = head.getNext();       // Update the head.
    	size--;
    	
    	if(size==0)                 // If size is zero, tail will become empty. 
    		tail = null;
    	
    	return answer;
    	
    }
    
    
    
}
