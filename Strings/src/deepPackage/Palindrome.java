package deepPackage;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(isP("malayalam".toLowerCase()));
	}

	private static boolean isP(String string) {
		char arr[] = string.toCharArray();
		for(int i = 0, j = arr.length - 1; i < j;)
			if(arr[i++] != arr[j--])
				return false;
		return true;
	}
}
