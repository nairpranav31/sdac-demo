package Main;

abstract class Policy{
	
	String name = "xzr";
	void displayName() {
		System.out.println("Name "+name);
	}
	void getLeaves() {
		System.out.println("Leave approved");
	}
	abstract double calSal(double sal) ;
}

class Acc extends Policy {
	@Override
	double calSal(double sal) {
		return sal;
	}
}

class Man extends Policy {
	@Override
	double calSal(double sal) {
		return sal;
	}
}

class Emp extends Policy {
	@Override
	double calSal(double sal) {
		return sal;
	}
}

public class Main {
	public static void main(String[] args) {
		Acc acc = new Acc();
		System.out.println(acc.calSal(40));
		acc.getLeaves();
		Man man = new Man();
		System.out.println(man.calSal(50));
		Emp emp = new Emp();
		System.out.println(emp.calSal(60));
		emp.displayName();
	}
}
