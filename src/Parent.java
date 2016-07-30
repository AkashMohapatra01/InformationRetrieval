public class Parent {
	public static void main(String[] args) {
		String str = "Java Code Geeks!";
		System.out.println("Length: " + str.length());
		
		//The following statement throws an exception, because
		//the request index is invalid.
		char ch = str.charAt(5);
	}
}