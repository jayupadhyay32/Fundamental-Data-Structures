import java.util.*;
public class Main {

	public static void main(String[] args)
	{
		DoublyLinkedList list = new DoublyLinkedList();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("Place a name to put in line, or press A to accept person waiting first in line. ");
		String name = sc.nextLine();
		
		if(name.equals("a") && list.isEmpty())
		{
			System.out.println("List is empty. ");
		}
		
		
		if(!list.isEmpty() && name.equals("a"))
		{
			System.out.println(list.removeLast());
		}
		else
		{
		list.addFirst(name);
		}
		}
	}
	
}
