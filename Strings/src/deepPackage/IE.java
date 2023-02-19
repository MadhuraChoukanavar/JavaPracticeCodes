package deepPackage;

public class IE {

	public static void main(String[] args) {
		for(int i = 0; i < 4; ++i) {
			System.out.println("h");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
	static void m1() {
		for(int i = 0; i < 4; ++i) {
			System.out.println("h");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

}
