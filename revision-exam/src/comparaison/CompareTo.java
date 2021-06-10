package comparaison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//comparable
public class CompareTo implements Comparable<CompareTo> {
	
	String nom , prenom;
	int age ;
	public CompareTo(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(CompareTo o) {
		return this.age - o.age ;
	}
	
	
	public static void main(String[] args) {
		CompareTo c = new CompareTo("naimy","x",51);
		CompareTo a = new CompareTo("naimy","bouchaib",23);
		CompareTo d = new CompareTo("naimy","y",54);
		CompareTo b = new CompareTo("naimy","soukaina",29);
		ArrayList<CompareTo> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		System.out.println("avant le tri");
		for (CompareTo compareTo : list) {
			System.out.println(compareTo.getAge());
		}
		Collections.sort(list);
		System.out.println("apres le tri");
		for (CompareTo compareTo : list) {
			System.out.println(compareTo.getAge());
		}
	}
	
	//comparator
	class nomcomparaison implements Comparator<CompareTo>{

		@Override
		public int compare(CompareTo o1, CompareTo o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	

}
