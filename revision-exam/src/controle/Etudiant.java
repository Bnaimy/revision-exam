package controle;

import java.util.Comparator;

public class Etudiant {
	
	public String nom , prenom;
	public int matricule ;
	public Etudiant(String nom, String prenom, int matricule) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	
	public static void main(String[] args) {
        Comparator<Etudiant> comparator = new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant o1, Etudiant o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        };

        Etudiant e1 = new Etudiant("no", "prenom", 11);
        Etudiant e2 = new Etudiant("nom", "prenom2", 12);

        System.out.println(comparator.compare(e1, e2));
	}
	//exercice 5
	Runnable message = new Runnable(){
		@Override
		public void run() {
			System.out.println("Bonjour, je suis un objet de type Runnable");
		}
	};

}
