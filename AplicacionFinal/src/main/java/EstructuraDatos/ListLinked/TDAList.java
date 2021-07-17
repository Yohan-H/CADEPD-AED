package EstructuraDatos.ListLinked;

public interface TDAList <T>{
	
	public boolean isEmptyList();
	
	public int length();
	
	public void destroyList();
	
	public int search(Object x);
	
	public void insertFirst(Object x);
	
	public void insertLast(Object x);
	
	public void removeNode(Object x);
}
