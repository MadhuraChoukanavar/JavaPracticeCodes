package deepPackage;

interface Interface1{
	default void m() {
		System.out.println("Default me"
				+ "thod");
	}
	static void m1() {
		System.out.println("Static method");
	}
	void m2();
}

public class Main implements Interface1{

	public static void main(String[] args) {
		Main main = new Main();
		main.m();
		Interface1.m1();
		main.m2();
	}

	@Override
	public void m2() {
		System.out.println("Abstract Method");
	}

}
