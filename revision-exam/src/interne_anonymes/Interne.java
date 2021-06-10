package interne_anonymes;

public class Interne {
	
	int x , y ;
	private static String nom = "naimy" ;
	
	class subinterne {
		public subinterne() {
			System.out.println(nom);
		}
	}
	public Interne(int x, int y) {
		this.x = x ;
		this.y = y ;
	}
	
	public sub_interne creerinstance()
	{
		return new sub_interne();
	}
	
	class sub_interne{
		sub_interne(){
			
		}
		public void afficher() {
			System.out.println(x+" "+y);
		}
	}
	
	public static void main(String[] args) {
		
		Interne i = new Interne(2,3);
		i.creerinstance();
		//sub_interne c = new sub_interne(); //nn erreur
		Interne.sub_interne interne = i.new sub_interne();
		
	}

}
