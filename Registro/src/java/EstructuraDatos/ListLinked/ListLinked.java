package EstructuraDatos.ListLinked;

import java.util.*;

public class ListLinked <T> implements TDAList <T>{
	protected Node<T> first;
        protected Node<T> last;
	public ArrayList<Node> listLinked = new ArrayList<Node>(0);
	
	public ListLinked() {
		this.first = null;
	}

	public boolean isEmptyList() {
		return listLinked.isEmpty();
	}

	public int length() {
		return listLinked.size();
	}

	public void destroyList() {
		listLinked.clear();
	}

	public int search(Object x) {
		int position = -1;
		for (int i = 0; i < listLinked.size(); i++) {
			if (listLinked.get(i).equals(x)) {
				position = i;
			}
		}
		return position;
	}

	public void insertFirst(Object x) {
		this.first = (Node<T>) x;
		listLinked.add(0, (Node) x);
		first = (Node<T>) x;
	}

	public void insertLast(Object x) {
		listLinked.add((Node) x);
                last = (Node<T>) x;
	}

	public void removeNode(Object x) {
		listLinked.remove(x);
	}
	
	public void toString1() {
		while (true) {
			System.out.println(getFirst().getData().toString());
			if (getFirst().getNext() == null) {
				break;
			} else {
				setFirst(getFirst().getNext());
			}
		}
	}
	public Node<T> getFirst(){
		return first;
	}
	public void setFirst(Object x) {
		this.first = (Node<T>) x;
	}
        public Node<T> getLast(){
		return last;
	}
	public void setLast(Object x) {
		this.last = (Node<T>) x;
	}
}