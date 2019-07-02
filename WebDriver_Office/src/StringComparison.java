
public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="selenium";
		String str2="SELENIUM";
		String str3="SELENIUM";
		String str4="zselenium";
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		System.out.println(str1.compareTo(str4));
		
		

	}

}
