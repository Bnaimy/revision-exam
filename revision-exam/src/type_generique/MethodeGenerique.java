package type_generique;

public class MethodeGenerique {
	
	public <T> T methode(T[] t) {
		
		int hasard = (int) (Math.random() * (t.length - 0)) ;
		
		return t[hasard];
		
	}

}
