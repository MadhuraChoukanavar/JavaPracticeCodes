package deepPackage;

public class LinearRecursiveCall {

	public static void main(String[] args) {
		int a[] = {1,54,7,7,4,7,-5,0,90,6,-12};
		
		System.out.println(search(a,90,0));
	}

	private static int search(int[] a, int element, int index) {
		if(index == a.length - 1) return -1;
		if(a[index] == element) return index;
		return search(a, element, ++index);
	}
}
