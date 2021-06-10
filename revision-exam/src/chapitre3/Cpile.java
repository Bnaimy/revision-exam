package chapitre3;
import java.util.LinkedList;

public class Cpile<T> implements Ipile<T> {

	LinkedList<T> list = new LinkedList<T>();
	@Override
	public boolean est_vide() {
		return list.isEmpty();
	}

	@Override
	public void empiler(T t) {
		list.addLast(t);
	}

	@Override
	public T depiler() {
		return list.removeLast();
	}

	@Override
	public int nbr_elements() {
		return list.size();
	}

	@Override
	public T sommet() {
		return list.getLast();
	}

}
