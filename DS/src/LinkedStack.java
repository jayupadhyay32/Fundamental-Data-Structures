
public class LinkedStack<E> implements Stack<E> {

	SinglyLinkedList Stack = new SinglyLinkedList();
	
	
	
	public int size() {
		
		return Stack.size();
	}

	@Override
	public boolean isEmpty() {
		
		return Stack.isEmpty();
	
	}

	@Override
	public E top() {
		
		return (E) Stack.first();
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return (E) Stack.removeFirst();
	}

	@Override
	public void push(E elem) {
		
		Stack.addFirst(elem);
		
	}

}
