
// Special Node Class for Doubly-Linked Lists. 
// Access to the previous and next node is also granted. 

public class NodeP<E> {

	private E elem;
	private NodeP<E> prev = null;
	private NodeP<E> next = null;   
	
	public NodeP(E e, NodeP<E> prev, NodeP<E> next)
	{
		elem = e;
		this.prev = prev;
		this.next = next; 
	}
	
	public E getElement()
	{
		return this.elem;
	}
	
	public NodeP<E> getPrev(){
		return prev;
	}
	
	public NodeP<E> getNext()
	{
		return next; 
	}
	
	
	public void setPrev(NodeP<E> prev)
	{
		this.prev = prev;
	}
	
	public void setNext(NodeP<E> next)
	{
		this.next = next;
	}
	
	
}
