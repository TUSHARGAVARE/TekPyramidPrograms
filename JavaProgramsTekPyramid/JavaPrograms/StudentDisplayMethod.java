package JavaPrograms;

public class StudentDisplayMethod {

	public int id;
	public String name;

	// Constructor to initialize the object
	public StudentDisplayMethod(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Method to display student details
	public void display() {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
	}

	public static void main(String[] args) {
		// Create an object of Student class
		StudentDisplayMethod student = new StudentDisplayMethod(29, "Tushar Gavare");

		// Call the display method
		student.display();
	}
}