package gn;

import java.util.HashSet;
import java.util.Set;

public class gen1 {

	public static void main(String[] args) {
		employee a1=new employee(110,"Naveen","CSE",150000);
		employee a2=new employee(111,"Sai","EEE",200000);
		employee a3=new employee(112,"Venkata","ECE",100000);
		
		Set<employee> employeeDetails=new HashSet<>();
		employeeDetails.add(a1);
		employeeDetails.add(a2);
		employeeDetails.add(a3);
		
		System.out.println(employeeDetails);
		
	}

}
class employee{
	 int id;
	 String name;
	String dept;
	 int salary;
	public employee(int id, String name,String dept,int salary) {
		this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
	}
	public void displaydetails() {
		 System.out.println("name:"+this.name);
	        System.out.println("dept:"+this.dept);
	        System.out.println("id:"+this.id);
	}
}