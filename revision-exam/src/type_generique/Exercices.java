package type_generique;

import java.util.ArrayList;
import java.util.List;

public class Exercices{
	
	//exercice 1
	
	public <T> T exe1(T a , T b) {
		List<T> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		int hasard = (int)(Math.random() * 2);
		return list.get(hasard);
	}
	
	public static void main(String[] args) {
		Exercices ex = new Exercices();
		System.out.println(ex.exe1(2,3));
		System.out.println(ex.exe1("chocho","nono"));
	}

}
