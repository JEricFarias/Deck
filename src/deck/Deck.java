package deck;

public class Deck<T> {
	public static final boolean RIGHT = true;
	public static final boolean LEFT = false;
	
	private No<T> first;
	private No<T> last;
	private int size;
	
	public Deck(){
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public No<T> getFirst() {
		return first;
	}

	public void setFirst(No<T> first) {
		this.first = first;
	}

	public No<T> getLast() {
		return last;
	}

	public void setLast(No<T> last) {
		this.last = last;
	}
	
	public int getSize(){
		return this.size;
	}
	
	/**
	 * Método add adciona um nó no Deck
	 * 
	 * @param side um valor boolean que determona o lado em que será adicionado o novo no.
	 * @param no Valor generico T que será quardado no nó. 
	 * 
	 * @return void
	 * 
	 * */
	public void add(boolean side, T value){
		// Right, direita.
		if(side){
			if(this.getFirst() == null && getSize() == 0){
				this.setFirst(new No<T>(value));
				this.setLast(this.getFirst());
				this.size++;
			}else{
				this.getLast().setNext( new No<T>(value) );
				this.getLast().getNext().setBack(this.getLast());
				this.setLast(this.getLast().getNext());
				this.size++;
			}
		// Left, esquerda.
		}else{
			if(this.getFirst() == null && getSize() == 0){
				this.setFirst(new No<T>(value));
				this.setLast(this.getFirst());
				this.size++;
			}else{
				this.getFirst().setBack( new No<T>(value));
				this.getFirst().getBack().setNext(this.getFirst());
				this.setFirst(this.getFirst().getBack());
				this.size++;
			}
		}
	}
	
	public T remove(boolean side){
		T temp = null;
		// Right, direita, se true
		if(side){
			// se for o ultimo nó...
			if(this.getLast().equals(getFirst())){
				temp = this.getLast().getValue();
				this.setFirst(null);
				this.setLast(null);
				this.size--;
			}else {
				temp = this.getLast().getValue();
				this.setLast(this.getLast().getBack());
				this.getLast().setNext(null);
				this.size--;
			}
		}else{
			// se for o ultimo nó...
			if(this.getLast().equals(getFirst())){
				temp = this.getFirst().getValue();
				this.setFirst(null);
				this.setLast(null);
				this.size--;
			}else {
				temp = this.getFirst().getValue();
				this.setFirst(this.getFirst().getNext());
				this.getFirst().setBack(null);
				this.size--;
			}
		}
		return temp;
	}
	
	
	/**
	 * Classe utilitaria e unidade do deck, ou seja, o que forma o deck. Um nó armazena um 
	 * valor do tipo T e mais dois valores do tipo Nó, esses valores nó armazena o nó anterior
	 * e o proximo nó, formando assim uma lista duplamente encadeada.	 * 
	 * */
	public static class No<T>{
		

		private T value;
		private No<T> next;
		private No<T> back;
		
		public No(T object){
			this.value = object;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public No<T> getNext() {
			return this.next;
		}

		public void setNext(No<T> next) {
			this.next = next;
		}

		public No<T> getBack() {
			return back;
		}

		public void setBack(No<T> back) {
			this.back = back;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((back == null) ? 0 : back.hashCode());
			result = prime * result + ((next == null) ? 0 : next.hashCode());
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			No<T> other = (No<T>) obj;
			if (back == null) {
				if (other.back != null)
					return false;
			} else if (!back.equals(other.back))
				return false;
			if (next == null) {
				if (other.next != null)
					return false;
			} else if (!next.equals(other.next))
				return false;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}
	}
}
