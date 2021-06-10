package chapitre3;

public class Exe2 {
	int[] tableau ;
	public Exe2(int[] tableau) {
		this.tableau = new int[tableau.length];
		for(int i = 0 ; i <=tableau.length - 1 ;i++)
		{
			this.tableau[i] = tableau[i];
		}
	}
	public void afficher() {
		for(int i = 0 ; i<=this.tableau.length - 1 ;i++)
		{
			System.out.println(tableau[i]);
		}
		
	};
	
	public <T extends Comparable<T>> void trier(T[] t) {
		int taille = t.length;
		
	}
	
	
	public static void main(String[] args) {
		Exe2 e = new Exe2(new int[] {1,3,5,0,10,2,20,6});
		e.afficher();
	}

}
