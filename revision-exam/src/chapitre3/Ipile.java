package chapitre3;

public interface Ipile<T> {
	boolean est_vide();
	void empiler(T t);
	T depiler();
	int nbr_elements();
	T sommet() ;
	

}
