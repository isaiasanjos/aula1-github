package aplication;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		
		
	 List<String> list = new ArrayList<>();
	 
	 list.add("Maria");
	 list.add("Bruno");
	 list.add("Joao");
	 list.add("Lucas");
	 list.add(3, "Tia");
	 list.add("Bruno");
	 
	 System.out.println(list.size());
	 for(String x : list) {
		 System.out.println(x);
	 }
	 System.out.println("---------------------------------------");
	 
	 list.removeIf(x -> x.charAt(0) == 'M');
	 for(String x : list) {
		 System.out.println(x);
	 }
	 System.out.println("-----------------------");
	 
	 System.out.println("Index of Maria: " + list.indexOf("Maria"));
	 System.out.println("Index of Bruno: " + list.indexOf("Bruno"));
	 
			
	

	}

}
