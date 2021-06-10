package controle;

import java.util.Comparator;

public class Exercices {
	
	//exercice1
	/*
	public int leplusfrequent(String chaine) {
		String temp = " ";
		int frequence = 0 ;
		for(int i = 0 ; i < chaine.length() ; i++) {
			temp = chaine.replace(String.valueOf(chaine.charAt(i)),"");
			if(chaine.length() - temp.length() > frequence)
			{
				frequence = chaine.length() - temp.length() ;
				chaine = temp ;
				temp = " " ;
			}
		}
		return frequence ;
	}*/
	//exercice2
	/*
	static String temp = " ";
	public String supprimerdoublons(String chaine) throws InterruptedException
	{
			temp = temp.concat(String.valueOf(chaine.charAt(0)));
			chaine = chaine.replace(String.valueOf(chaine.charAt(0)),"");
			System.out.println(chaine);
			System.out.println(chaine.length());
			Thread.sleep(500);
			supprimerdoublons(chaine);
		return temp;
	}
	*/
	public static void main(String[] args) throws InterruptedException {
		Exercices d = new Exercices();
		//System.out.println(d.leplusfrequent("tototoo"));
		//d.supprimerdoublons("bouchaibbb");
		//String bouchaib = "bouchaibb";
		//System.out.println(bouchaib.substring(0,2));
		//System.out.println(d.nombre("bouchaib naimy th df se gg",2));
		Comparator<Integer> t = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2) ;
			}
			
		};
		t.compare(4,7);
		Comparable<Integer> tt = new Comparable<Integer>() {
			
			@Override
			public int compareTo(Integer o) {
				return 3 - o;
			}
		};
		tt.compareTo(4);
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("bonjour le monde");
			}
		};
		Thread t = new Thread(r);
		t.start();
		t.co
	}
	
	//exercice3
	public int nombre(String chaine , int n) {
		String[] mots = chaine.split(" ");
		int cpt = 0 ;
		for (String string : mots) {
			if(string.length()==2)
			{
				cpt++;
			}
		}
		return cpt;
		
	}

}
