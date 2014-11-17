/**
*Generic list that only takes objects that implements "Skill" as argument.
*Implements Iterable so you can use that nice looking for each.
*
*@vsoyseth
*/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GameCharacterList <T extends Skill> implements Iterable<T>{
	private Node head;
	private Node tail;
	private Node last;

	public GameCharacterList(){
		this.head = null;
		this.tail = null;
		this.last = null;
	}

	class Node{
		T    object;
		Node next;

		Node(T object){
			this.object = object;
		}
	}

	public T add(T object){

		if(head == null) {
			head = new Node(object);
			last = head;
		}else{
			tail	  = new Node(object);
			last.next = tail;
			last	  = tail;
		}
		return object;
	}

	public Iterator<T> iterator(){return new TableIterator();}


	class TableIterator implements Iterator<T>{
		Node tmp = head;

		public T next(){
			if(hasNext()){
				Node returnAble = tmp;
				tmp 			= tmp.next;
				return returnAble.object;
			} else {
				throw new NoSuchElementException();
			}		
		}

		public boolean hasNext(){
			return tmp != null;			
		}

		public void remove(){
			throw new UnsupportedOperationException();			
		}
	}
}