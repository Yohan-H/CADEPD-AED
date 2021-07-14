package Hashing;

public class LinkedList<T extends Comparable<T>>  {
		int count ;
		NodeList<T> first;
		public LinkedList(){
			first = new NodeList<T>(null,null);
			count=0;
		} 
		public void initializeList(){
			first = new NodeList<T>(null,null);
			count=0;
		}
		public String search(T searchItem){
			
			NodeList<T> aux=first.getLink();
			while (aux!=null && aux.getInfo().compareTo(searchItem) != 0 ) {
				aux=aux.getLink();
			}
			if (aux!=null && aux.getInfo().compareTo(searchItem) == 0) {
				return aux.getInfo().toString();
			}
			return null;
		}

	    public void insert(T newItem)
		{
	    	if (search(newItem)==null) {
	    	NodeList<T> aux=first;
	    	
	    		while (aux.getLink()!=null && aux.getLink().getInfo().compareTo(newItem)<0) {
	    			aux=aux.getLink();
	    		}
	    		NodeList<T> au = new NodeList<T>(newItem,aux.getLink());
	    		aux.setLink(au);
	    		count++;
	    	}
		}

		
		public void deleteNode (T deleteItem) {
			if (isEmpty()) {
				return;
			}
			if (this.search(deleteItem) == null) {
				this.first = this.first.getLink();
				this.count--;
			}
			else {
				NodeList<T> aux=first;
				while (aux.getLink() != null && aux.getLink().getInfo().compareTo(deleteItem) != 0) {
					aux=aux.getLink();
				}
				if (aux.getLink() != null) {
					aux.setLink(aux.getLink().getLink());
					this.count--;
				}
			}

		}
		public boolean isEmpty(){
			return (first.getLink() == null);
		}
		public String toString() {
			String cadena="";
			NodeList<T> aux = first.getLink();
			while(aux != null ) {
				cadena += (aux.getInfo()+" ");
				aux = aux.getLink();
			}
			return cadena;
		}

}
