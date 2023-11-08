package newbie;

import java.util.Random;

public class Bai6 {

	public static void checkLeapYear(int numberYear) {
		if (numberYear % 4 == 0) {
			if (numberYear % 100 == 0) {
				if (numberYear % 400 == 0) {
					System.out.println("Năm " + numberYear + " là năm nhuận.");
				} else {
					System.out.println("Năm " + numberYear + " không phải là năm nhuận.");
				}
			} else {
				System.out.println("Năm " + numberYear + " là năm nhuận");
			}
		} else {
			System.out.println("Năm " + numberYear + " không phải là năm nhuận");
		}
	}

	public static void main(String[] args) {
		System.out.println("Random nam can kiem tra");
		int max = 3000;
		int min = 2000;
		Random rd = new Random();
		int number = rd.nextInt(max - min + 1) + min;
		checkLeapYear(number);

	}

}
