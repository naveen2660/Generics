package gn;

import java.util.Date;

public class gen42 {

	public static void main(String[] args) {
		Pairing<String,Date> myObj = new Pairing<>();
		myObj.setKey("555");
		System.out.println(myObj.getKey());
		myObj.setValue(new Date());
		System.out.println(myObj.getValue());

	}

}
class Pairing<K,V>{
	K key;
	V value;
	
	
 public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}