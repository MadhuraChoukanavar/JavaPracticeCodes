package deepPackage;

public class BinaryRecursiveCall {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(search(a,9,0,a.length-1));
	}

	private static int search(int[] a, int element, int start, int end) {
		if(start > end ) return -1;
		int mid = (start + end) / 2;
		if(a[mid] == element) return mid;
		else
			if(element > a[mid]) return search(a, element, mid + 1, end);
			return search(a, element, start, mid - 1);
	}
}
