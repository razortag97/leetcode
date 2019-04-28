package interviews.adobe.tmgl;

import java.lang.reflect.Field;
import java.util.Collection;

public class Iterator<E> {
	
	private Collection<E> collection;
	private Filter f;
	
	public Iterator(Collection<E> elements, Filter f){
		this.collection = elements;
		this.f = f;
	}
	
	public boolean hasNext() {
		if(collection.iterator().hasNext()) {
			return true;
		}
		return false;
	}
	
	/**public E next() {
		E e = null;
		while(collection.iterator().hasNext()) {
			e = collection.iterator().next();
			Field[] fields = e.getClass().getDeclaredFields();
			for (Field field : fields) {
				
			}
		}
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
