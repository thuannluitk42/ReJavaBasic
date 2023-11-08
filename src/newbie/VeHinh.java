package newbie;

import java.util.Iterator;

public class VeHinh {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			System.out.print("*");
			for (int j = i + 1; j < 7; j++) {
				System.out.print("-");
			}
			System.out.println("\n");
		}
	}

}
