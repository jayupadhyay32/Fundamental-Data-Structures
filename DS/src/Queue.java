
public class Queue<E> {
	
	SinglyLinkedList list = new SinglyLinkedList();
	
	int size = 0;
	
	
	public void enqueue(E e)
	{
		list.addLast(e);
		size++;
	}
	
	public E dequeue()
	{
		size--;
		return (E) list.removeFirst();
		
	}
	
	public int size()
	{
		return size; 
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	

}
