
public class DoublyLinkedList<E> {
	
	private int size = 0;
	private NodeP<E> header = null;
	private NodeP<E> trailer = null; 
	
	public DoublyLinkedList()
	{
		header = new NodeP(null,null,null);       // Header is created. 
		trailer = new NodeP(null,header,null);    // Trailer follows header.
		header.setNext(trailer);	              // Trailer is set to follow the header. 
	}
	
    public int size()
    {
    	return this.size; 
    }
    
    public boolean isEmpty()
    {
    	return size==0;
    }
    
    public E first()
    {
    	if(isEmpty())
    	return null;
    	
    	return header.getNext().getElement();
    }
    
    public E last()
    {
    	if(isEmpty())
        return null; 
    	
    	return trailer.getPrev().getElement();
    }
    
    
    public void addFirst(E e)
    {
    	addBetween(e, header, header.getNext());
    }
    
    public void addLast(E e)
    {
    	addBetween(e, trailer.getPrev(), trailer);
    }
    
    public E removeFirst()
    {
    	if(isEmpty())
    		return null;
    	size--;
		
	    return remove(header.getNext());
    }
    
    public E removeLast()
    {
    	if(isEmpty())
    	return null;
    	
    	size--;
    	return remove(trailer.getPrev());
    	
    }
    
    public E remove(NodeP<E> node) {
		
    	NodeP<E> previous = node.getPrev();
    	NodeP<E> successor = node.getNext();
    	
    	previous.setNext(successor);      //Point the Previous to the successor.
    	successor.setPrev(previous);      // Link ignores the incoming node.  
    	
    	return node.getElement();
	}

	public void addBetween(E e, NodeP<E> prev, NodeP<E> next)
    {
    	NodeP<E> newest = new NodeP(e,prev,next);   // Create a new node in which element is stored between next and prev.
    	prev.setNext(newest);                       //       PREV   --> newest
    	next.setPrev(newest);                       //       newest <-- NEXT 
    	size++;                                     // Increment the size of the list. 
    }
    
    
	
}
