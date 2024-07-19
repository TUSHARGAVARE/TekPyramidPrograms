package JavaPrograms;

public class MethodOverloading {

	public void Marker() {
		System.out.println("Marker used by Trainer");
	}

	public void Marker(String x, int price) {
		System.out.println("Marker properties " + price + ", " + x);
	}

	public void Marker(int x, int y) {
		System.out.println("Marker Length and Width " + x + " , " + y);
	}

	public void Marker(double x, double y) {
		System.out.println("Marker tipsize " + x + " ," + y);
	}

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.Marker();
		m.Marker("Blue", 25);
		m.Marker(12,3);
		m.Marker(1.2, 5.2);
	}
}