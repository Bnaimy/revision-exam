package type_generique;

@SuppressWarnings("hiding")
public class Triplet<Triplet> {
	
	Triplet a , b , c ;

	public Triplet(Triplet a, Triplet b, Triplet c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triplet getA() {
		return a;
	}

	public Triplet getB() {
		return b;
	}

	public Triplet getC() {
		return c;
	}
	
	public void afficher() {
		System.out.println(a.toString()+b.toString()+c.toString());
	}
}
