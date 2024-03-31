package Week01;

import java.util.*;


//program to sort Employee objects based on highest salary using Comparator
class Employee {
	String Name;
	double Age;
	double Salary;
	
	Employee(){}
	
	Employee(double Salary, double Age, String Name) {
		this.Salary = Salary;
		this.Age = Age;
		this.Name = Name;
	}

}

class EmployeeComparator implements Comparator<Employee>{
	
	//overriding the compare method to compare salary values
	public int compare(Employee e, Employee e1) {
		if (e.Salary == e1.Salary) {
			return 0;
		} else if (e.Salary > e1.Salary) {
			return 1;
		} else {
			return -1;
			}
	}
}

public class Question05 {
	public static void main(String[] args) {		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(3500, 34, "Goku"));
		list.add(new Employee(3400, 36, "Vegeta"));
		list.add(new Employee(5000, 35, "Bulma"));
		list.add(new Employee(2500, 18, "Trunks"));
		Collections.sort(list, new EmployeeComparator());
		
		for (Employee e: list) {
			System.out.println("Name: " + e.Name + ", Salary: " + 
		e.Salary + ", Age: " + e.Age);
		}
	}

}


