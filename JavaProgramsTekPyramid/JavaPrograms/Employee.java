package JavaPrograms;

public class Employee {
	String empid;
	int salary;
	String department;

	Employee(String empid, int salary, String department) {
		this.empid = empid;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", department=" + department + "]";
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("TEK23", 30000, "RMG");
		Employee e2 = new Employee("TEK25", 35000, "ELF");
		System.out.println(e1);
		System.out.println(e2);
		Employee e3 = e2;
		System.out.println((e3));
		System.out.println(e3.equals(e2));

	}

}
