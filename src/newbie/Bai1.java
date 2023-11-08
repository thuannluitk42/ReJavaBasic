package newbie;

import java.util.Scanner;

public class Bai1 {
	String name;

	public void nhapTen() {
		System.out.print("Nhap ten cua ban: ");
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.nextLine();
	}

	public void hienThiTen() {
		System.out.print("Ten cua ban la: " + this.name);
	}

	public void tamDung() {
		if (this.name.equals("tamDung")) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Bai1 b1 = new Bai1();
		b1.nhapTen();

	}
}
