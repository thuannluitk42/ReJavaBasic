package newbie;

public class TestString {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");

		if (str1 == str2) {
			System.out.println("ss1");
			System.out.println("2 chuoi nay giong nhau");
		}
		
		if (str1 == str3) {
			System.out.println("ss2");
			System.out.println("2 chuoi nay giong nhau");
		}
		
		str1 = str2;
		str2 = "def";
		System.out.println("chuoi str1: " +str1);
		System.out.println("chuoi str2: " +str2);
	}

}
