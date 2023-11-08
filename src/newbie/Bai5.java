package newbie;

public class Bai5 {
	public static double cvtCtoF(double number) {
		return (number * 1.8) + 32;
	}

	public static double cvtFtoC(double number) {
		return (number - 32) * 5 / 9;
	}

	public static void main(String[] args) {
		System.out.println("cvtCtoF: " + cvtCtoF(36.5));
		System.out.println("cvtFtoC: " + cvtFtoC(97.7));
	}
}
