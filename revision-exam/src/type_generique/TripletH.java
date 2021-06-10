package type_generique;

public class TripletH<T,U,V> {
	
	T u ;
	U v ;
	V x ;
	
	public TripletH(T u , U v , V x){
		
		this.u = u ;
		this.v = v ;
		this.x = x ;
	}
	public T getU() {
		return u;
	}
	public U getV() {
		return v;
	}

	public V getX() {
		return x;
	}
	
	public void afficher() {
		System.out.println(u+" "+v+" "+x+" ");
	}
	
	

}
