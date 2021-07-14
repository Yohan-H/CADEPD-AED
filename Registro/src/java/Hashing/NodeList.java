package Hashing;

public class NodeList<T>{
	private	T info;
	private NodeList<T> link;
   	public NodeList(T info){
		this.info = info;
		this.link = null;    
    	}

	//Initializes the values of node
	//Postcondition: this.info = info, this.link = link
   	public NodeList(T info, NodeList<T> link){
		this.info = info;
		this.link = link;    
    }
   	public T getInfo() {return info;}
   	public NodeList<T> getLink() {return link;}
   	public void setInfo(T info) { this.info = info; }
   	public void setLink(NodeList<T> link) { this.link = link; }
} 
