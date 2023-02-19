package deepPackage;

public class GetAllPallindromeInaSentence {

	public static void main(String[] args) {
		System.out.print("Enter any string: ");
		String string = new java.util.Scanner(System.in).nextLine().toLowerCase();
		String stringArray[] = string.split(" ");
		for(String eachString: stringArray)
			if(isPalindrome(eachString))
				System.out.println(eachString);
	}

	private static boolean isPalindrome(String eachString) {
		char charArray[] = eachString.toCharArray();
		for(int start = 0, end = charArray.length-1; start < end ;)
			if(charArray[start++] != charArray[end--])
				return false;
		return true;
	}
}
