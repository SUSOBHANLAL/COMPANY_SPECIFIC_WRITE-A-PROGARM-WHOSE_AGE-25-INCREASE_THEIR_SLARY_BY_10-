package javaEmployeeConditionOnsalary;
import java.util.*;
class employee1{
	String name;
	int age;
    double salary;
    employee1(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	};
	public   void increasesal() {
		if(age>25) {
			salary = salary+(salary*0.10);
		}
	}
	
	
}

public class employee {
	public static void main(String args[]) {
		ArrayList <employee1> emp = new ArrayList<>(); 
		emp.add(new employee1("susobhan",25,2000.00));
		emp.add(new employee1("sushi",26,24000.00));
		emp.add(new employee1("sobhan",29,2900.00));
		
		for(employee1 empss:emp) {
			System.out.print(" name  "+empss.getName());
			System.out.print(" age  "+empss.getAge());
			System.out.print(" slary  "+empss.getSalary());
			empss.increasesal();
			System.out.print("  new salary  "+empss.getSalary());
			System.out.println();
		}
		
		
		
		
		
	}

}
