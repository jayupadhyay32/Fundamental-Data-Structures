
public class Node<E> {
	
	// Node class for Singly and Circularly Linked lists. 
	// Access to the next node only.
	
	private E element;
	private Node<E> next;
	
	public Node(E e, Node<E> n)
	{
		element = e;
		next = n;
	}
	
	public E getElement()
	{
		return this.element;
	}
	
	public Node<E> getNext(){
		return this.next;
	}
	
	public void setNext(Node<E> next)
	{
		this.next = next;
		
	}
    
}
