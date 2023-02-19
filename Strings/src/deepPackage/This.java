package deepPackage;

interface Interface{
	final static int a = 1;
//	int a;
//	{}
//	static {}
	public abstract void m();
	default void m2(){}
	static void m1() {}
}

class Super{
	void m1() {
		
	}
	void m() {
		
	}
	void m2() {
		
	}
}

public class This extends Super{
	@Override
	void m() {
		System.out.println(this);
	}
	void m3() {
		System.out.println(this);
	}
	
	This(int a){
		return;
	}
	
	static {
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		System.out.println("2");
		Super s = new This(0);
		This t = (This)s;
		t.m3();
		new This(1);
//		This a = new This();
//		This b = new This();
//		System.out.println(a);
//		a.m();
//		System.out.println(b);
//		b.m();
	}
	static {
		System.out.println("3");
	}
}
