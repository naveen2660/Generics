package gn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class gen2 {

	public static void main(String[] args) {
		HashMap<Integer,Double> keys = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int key = sc.nextInt();
			Double value = sc.nextDouble();
			keys.put(key,value);
		}
//		keys.put(10,3.1);
//		keys.put(11,3.2);
//		keys.put(12,3.3);
//		
//		keys.put(13,3.4);
//		keys.put(14,3.5);
//		keys.put(15,3.6);
//		keys.put(16,3.7);
//		keys.put(17,3.8);
//		keys.put(18,3.9);
//		keys.put(19,4.0);
		
		System.out.println("Mapped elements are: ");
		 for(Map.Entry m : keys.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
		
	}

}
